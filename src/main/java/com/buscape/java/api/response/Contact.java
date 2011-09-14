/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de um contato
 */
public class Contact {
	private String label;
	private String value;

	/**
	 * @return the label
	 */
	public final String getLabel() {
		return label;
	}

	/**
	 * @return the value
	 */
	public final String getValue() {
		return value;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public final void setLabel( String label ) {
		this.label = label;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public final void setValue( String value ) {
		this.value = value;
	}
}