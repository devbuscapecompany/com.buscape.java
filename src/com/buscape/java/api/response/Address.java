/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de um endereço.
 */
public class Address {
	private String name;
	private String postalArea;
	private String complement;
	private String district;
	private String city;
	private String state;
	private String postalCode;
	private String fone;
	private Map map;

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}
	/**
	 * @return the complement
	 */
	public final String getComplement() {
		return complement;
	}
	/**
	 * @return the district
	 */
	public final String getDistrict() {
		return district;
	}
	/**
	 * @return the fone
	 */
	public final String getFone() {
		return fone;
	}
	/**
	 * @return the map
	 */
	public final Map getMap() {
		return map;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @return the postalArea
	 */
	public final String getPostalArea() {
		return postalArea;
	}
	/**
	 * @return the postalCode
	 */
	public final String getPostalCode() {
		return postalCode;
	}
	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}
	/**
	 * @param city
	 *            the city to set
	 */
	public final void setCity( String city ) {
		this.city = city;
	}
	/**
	 * @param complement the complement to set
	 */
	public final void setComplement( String complement ) {
		this.complement = complement;
	}
	/**
	 * @param district the district to set
	 */
	public final void setDistrict( String district ) {
		this.district = district;
	}
	/**
	 * @param fone the fone to set
	 */
	public final void setFone( String fone ) {
		this.fone = fone;
	}
	/**
	 * @param map the map to set
	 */
	public final void setMap( Map map ) {
		this.map = map;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName( String name ) {
		this.name = name;
	}
	/**
	 * @param postalArea the postalArea to set
	 */
	public final void setPostalArea( String postalArea ) {
		this.postalArea = postalArea;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public final void setPostalCode( String postalCode ) {
		this.postalCode = postalCode;
	}
	/**
	 * @param state the state to set
	 */
	public final void setState( String state ) {
		this.state = state;
	}
}