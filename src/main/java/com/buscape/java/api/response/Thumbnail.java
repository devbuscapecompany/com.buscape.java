/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Repesentação de uma imagem
 */
public class Thumbnail {
	private int height;
	private String url;
	private int width;

	/**
	 * @return the height
	 */
	public final int getHeight() {
		return height;
	}

	/**
	 * @return the url
	 */
	public final String getUrl() {
		return url;
	}

	/**
	 * @return the width
	 */
	public final int getWidth() {
		return width;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public final void setHeight( int height ) {
		this.height = height;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public final void setUrl( String url ) {
		this.url = url;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public final void setWidth( int width ) {
		this.width = width;
	}
}