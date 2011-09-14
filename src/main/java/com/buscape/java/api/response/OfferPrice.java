/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de um preço de uma oferta
 */
public class OfferPrice {
	private String currency;
	private double value;
	private OfferParcel parcel;

	/**
	 * @return the currency
	 */
	public final String getCurrency() {
		return currency;
	}

	/**
	 * @return the parcel
	 */
	public final OfferParcel getParcel() {
		return parcel;
	}

	/**
	 * @return the value
	 */
	public final double getValue() {
		return value;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public final void setCurrency( String currency ) {
		this.currency = currency;
	}

	/**
	 * @param parcel
	 *            the parcel to set
	 */
	public final void setParcel( OfferParcel parcel ) {
		this.parcel = parcel;
	}

	/**
	 * @param value the value to set
	 */
	public final void setValue( double value ) {
		this.value = value;
	}
}