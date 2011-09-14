/**
 * @brief	Pacote base da biblioteca do grupo BuscaPé
 * @details	Esse pacote contém as classes e interfaces necessárias para
 * 			integração com as APIs do Grupo BuscaPé.
 * @package	com.buscape.java.api
 */
package com.buscape.java.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import com.buscape.java.api.response.JSONResponseBuilder;
import com.buscape.java.api.response.ResponseBuilder;
import com.buscape.java.api.response.Result;

/**
 * @brief Interface de uma operação de uma API
 * @details Interface para criação de uma operação das APIs do Grupo BuscaPé.
 */
public abstract class APIOperation {
	protected APIInterface apiInterface;
	protected String countryCode;
	protected String httpResponse;
	protected Map<String , String> parameters;

	/**
	 * @details Constroi o objeto que representa uma operação da API
	 * @param apiInterface
	 *            Objeto que representa a API.
	 */
	public APIOperation( APIInterface apiInterface ) {
		this.apiInterface = apiInterface;
		parameters = new HashMap<String , String>();
		parameters.put( "format" , "json" );
	}

	/**
	 * @details Recupera o objeto HTTPResponse com a resposta HTTP da última
	 *          chamada à operação.
	 * @return Última resposta HTTP
	 */
	public String __getLastResponse() {
		return httpResponse;
	}

	/**
	 * @brief Faz a chamada à uma operação de API
	 * @details Efetua a chamada à uma operação da API.
	 * @return Resultado da chamada
	 */
	public Result call() {
		String query = null;
		String path = getOperationPath() + apiInterface.getApplicationId();

		if ( countryCode != null ) {
			path += "/" + countryCode;
		}

		path += '/';

		final Iterator<Entry<String , String>> entryIterator = parameters.entrySet().iterator();

		while ( entryIterator.hasNext() ) {
			final Entry<String , String> current = entryIterator.next();

			if ( query == null ) {
				query = "?";
			} else {
				query += "&";
			}

			try {
				query += URLEncoder.encode( current.getKey() , "UTF-8" ) + "=" + URLEncoder.encode( current.getValue() , "UTF-8" );
			} catch ( final UnsupportedEncodingException ignored ) {
			}
		}

		try {
			final HttpURLConnection httpURLConnection = apiInterface.getHttpConnection( path + query );
			final InputStream inputStream = httpURLConnection.getInputStream();

			try {
				final BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
				final StringBuilder stringBuffer = new StringBuilder();
				final ResponseBuilder responseBuilder = new JSONResponseBuilder();

				String line = null;

				while ( ( line = bufferedReader.readLine() ) != null ) {
					stringBuffer.append( line + '\n' );
				}

				responseBuilder.parse( stringBuffer.toString() );

				return responseBuilder.getResult();
			} finally {
				try {
					inputStream.close();
				} catch ( final IOException ignored ) {
				}
			}
		} catch ( final MalformedURLException ignored ) {
		} catch ( final IOException ignored ) {
		}

		return null;
	}

	/**
	 * @details Recupera o código do país utilizado na internacionalização dos
	 *          resultados das chamadas à operação.
	 * @return Código do país utilizado nos resultados.
	 */
	public final String getCountryCode() {
		return countryCode;
	}

	/**
	 * @details Recupera o caminho onde a chamada à operação deverá ser
	 *          realizado.
	 * @return O caminho onde será realizado a requisição
	 */
	protected abstract String getOperationPath();

	/**
	 * @details Define o código do país para internacionalização dos resultados
	 *          das operações da API.
	 * @param countryCode
	 *            O código do país com dois caracteres (BR, AR, etc...)
	 * @throws IllegalArgumentException
	 */
	public final void setCountryCode( String countryCode ) throws IllegalArgumentException {
		if ( countryCode.length() != 2 ) {
			throw new IllegalArgumentException( "O código do país deve ter dois caracteres." );
		}

		setParam( "countryCode" , countryCode );
		this.countryCode = countryCode;
	}

	/**
	 * @brief Define um par nome=valor que será enviado junto à requisição
	 * @param name
	 * @param value
	 */
	public final void setParam( String name , String value ) {
		parameters.put( name , value );
	}
}