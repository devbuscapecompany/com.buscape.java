/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Valor de um filtro
 */
public class FilterValue {
	private int id;
	private String value;

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public final String getValue() {
		return value;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId( int id ) {
		this.id = id;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public final void setValue( String value ) {
		this.value = value;
	}
}