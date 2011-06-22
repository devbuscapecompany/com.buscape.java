/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Operação findAdvertiserList
 * @details Essa classe representa a operação findAdvertiserList da API do
 *          Lomadee.
 * 
 *          O serviço findAdvertisersList retorna uma lista de anunciantes
 *          vinculados a um determinado publisher, podendo assim obter uma
 *          melhora na configuração de suas aplicações e permitindo que os
 *          usuários escolham quais programas a aplicação utilizará.
 */
public class LomadeeFindAdvertiserListOperation extends APIOperation {
	private int publisherId;
	private int siteId;
	private String token;

	public LomadeeFindAdvertiserListOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	@Override
	protected String getOperationPath() {
		return "/service/findAdvertiserList/lomadee/";
	}

	/**
	 * @return o ID do publisher
	 */
	public final int getPublisherId() {
		return publisherId;
	}

	/**
	 * @return o ID do site selecionado pelo publisher
	 */
	public final int getSiteId() {
		return siteId;
	}

	/**
	 * @return o Token utilizado para validação de requisição
	 */
	public final String getToken() {
		return token;
	}

	/**
	 * @param publisherId
	 *            o ID do publisher
	 */
	public final void setPublisherId( int publisherId ) {
		setParam( "publisherId" , Integer.toString( publisherId ) );
		this.publisherId = publisherId;
	}

	/**
	 * @param siteId
	 *            ID do site selecionado pelo publisher
	 */
	public final void setSiteId( int siteId ) {
		setParam( "siteId" , Integer.toString( siteId ) );
		this.siteId = siteId;
	}

	/**
	 * @param token
	 *            o Token utilizado para validação de requisição
	 */
	public final void setToken( String token ) {
		setParam( "token" , token );
		this.token = token;
	}
}