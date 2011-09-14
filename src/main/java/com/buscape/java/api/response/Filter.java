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
 * @brief Representação de um filtro
 */
public class Filter {
	private int id;
	private String name;
	private List<FilterValue> values;

	/**
	 * @param value
	 *            the value to be added
	 */
	public void addValue( FilterValue value ) {
		getValues().add( value );
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the values
	 */
	public final List<FilterValue> getValues() {
		if ( values == null ) {
			values = new ArrayList<FilterValue>();
		}

		return values;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId( int id ) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName( String name ) {
		this.name = name;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public final void setValues( List<FilterValue> values ) {
		this.values = values;
	}
}