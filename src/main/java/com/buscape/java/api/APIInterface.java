/**
 * @brief	Pacote base da biblioteca do grupo BuscaPé
 * @details	Esse pacote contém as classes e interfaces necessárias para
 * 			integração com as APIs do Grupo BuscaPé.
 * @package	com.buscape.java.api
 */
package com.buscape.java.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @brief Base para a implementação de uma API do Grupo BuscaPé.
 * @details Essa classe reúne código comum para todas as APIs do Grupo BuscaPé.
 */
public abstract class APIInterface {
	protected String applicationId;
	protected boolean sandbox = false;

	/**
	 * @return the applicationId
	 */
	public final String getApplicationId() {
		return applicationId;
	}

	/**
	 * @return the httpConnection
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public final HttpURLConnection getHttpConnection( String path ) throws MalformedURLException, IOException {
		final URL url = new URL( "http://" + getTargetHost() + path );
		final HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.setRequestMethod( "GET" );
		httpConnection.setDoOutput( true );
		httpConnection.connect();

		return httpConnection;
	}

	/**
	 * @return O host da API
	 */
	public String getTargetHost() {
		if ( sandbox ) {
			return "sandbox.buscape.com";
		} else {
			return "bws.buscape.com";
		}
	}

	/**
	 * @return the sandbox
	 */
	public final boolean isSandbox() {
		return sandbox;
	}

	/**
	 * @param applicationId
	 *            the applicationId to set
	 */
	public final void setApplicationId( String applicationId ) {
		this.applicationId = applicationId;
	}

	/**
	 * @param sandbox
	 *            the sandbox to set
	 */
	public final void setSandbox( boolean sandbox ) {
		this.sandbox = sandbox;
	}
}