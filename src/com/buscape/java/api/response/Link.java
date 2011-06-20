/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de um link
 */
public class Link {
	private String type;
	private String url;

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @return the url
	 */
	public final String getUrl() {
		return url;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType( String type ) {
		this.type = type;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public final void setUrl( String url ) {
		this.url = url;
	}
}