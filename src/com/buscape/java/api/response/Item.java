/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @brief Representação de um item
 */
public class Item {
	private String label;
	private List<String> values;

	/**
	 * @param value
	 *            the value to be added
	 */
	public void addValue( String value ) {
		getValues().add( value );
	}

	/**
	 * @return the label
	 */
	public final String getLabel() {
		return label;
	}

	/**
	 * @return the values
	 */
	public final List<String> getValues() {
		if ( values == null ) {
			values = new ArrayList<String>();
		}

		return values;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public final void setLabel( String label ) {
		this.label = label;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public final void setValues( List<String> values ) {
		this.values = values;
	}
}