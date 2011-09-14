/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de uma parcela de uma oferta
 */
public class OfferParcel {
	private double interest;
	private int number;
	private double value;

	/**
	 * @return the interest
	 */
	public final double getInterest() {
		return interest;
	}

	/**
	 * @return the number
	 */
	public final int getNumber() {
		return number;
	}

	/**
	 * @return the value
	 */
	public final double getValue() {
		return value;
	}

	/**
	 * @param interest
	 *            the interest to set
	 */
	public final void setInterest( double interest ) {
		this.interest = interest;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public final void setNumber( int number ) {
		this.number = number;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public final void setValue( double value ) {
		this.value = value;
	}
}