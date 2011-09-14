/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Operação createSource
 * @details Essa classe representa a operação createSource da API do Lomadee.
 * 
 *          Serviço utilizado somente na integração do Aplicativo com a Lomadee.
 *          Dentro do fluxo de integração, o aplicativo utiliza esse serviço
 *          para criar sourceId (código) para o Publisher que deseja utiliza-lo.
 */
public class LomadeeCreateSourceOperation extends APIOperation {
	private String campaignList;
	private int publisherId;
	private int siteId;
	private String sourceName;
	private String token;

	public LomadeeCreateSourceOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	/**
	 * @return Recupera a Lista de IDs das campanhas separados por virgula.
	 */
	public final String getCampaignList() {
		return campaignList;
	}

	@Override
	protected String getOperationPath() {
		return "/service/createSource/lomadee/";
	}

	/**
	 * @return Recupera o ID do publisher
	 */
	public final int getPublisherId() {
		return publisherId;
	}

	/**
	 * @return Recupera o ID do site selecionado pelo publisher.
	 */
	public final int getSiteId() {
		return siteId;
	}

	/**
	 * @return Recupera o Nome do código
	 */
	public final String getSourceName() {
		return sourceName;
	}

	/**
	 * @return Recupera o Token utilizado para validação da requisição.
	 */
	public final String getToken() {
		return token;
	}

	/**
	 * @param campaignList
	 *            A Lista de IDs das campanhas separados por virgula.
	 */
	public final void setCampaignList( String campaignList ) {
		setParam( "campaignList" , campaignList );
		this.campaignList = campaignList;
	}

	/**
	 * @param publisherId
	 *            O ID do publisher
	 */
	public final void setPublisherId( int publisherId ) {
		setParam( "publisherId" , Integer.toString( publisherId ) );
		this.publisherId = publisherId;
	}

	/**
	 * @param siteId
	 *            O ID do site selecionado pelo publisher.
	 */
	public final void setSiteId( int siteId ) {
		setParam( "siteId" , Integer.toString( siteId ) );
		this.siteId = siteId;
	}

	/**
	 * @param sourceName
	 *            O Nome do código
	 */
	public final void setSourceName( String sourceName ) {
		setParam( "sourceName" , sourceName );
		this.sourceName = sourceName;
	}

	/**
	 * @param token
	 *            O Token utilizado para validação da requisição.
	 */
	public final void setToken( String token ) {
		setParam( "token" , token );
		this.token = token;
	}
}