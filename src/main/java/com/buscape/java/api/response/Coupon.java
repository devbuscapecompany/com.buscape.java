/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de um cupom.
 */
public class Coupon {
	private int id;
	private Link link;
	private String description;
	private String type;

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the link
	 */
	public final Link getLink() {
		return link;
	}

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public final void setDescription( String description ) {
		this.description = description;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId( int id ) {
		this.id = id;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public final void setLink( Link link ) {
		this.link = link;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType( String type ) {
		this.type = type;
	}
}