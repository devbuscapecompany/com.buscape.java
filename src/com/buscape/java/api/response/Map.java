/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação geográfica
 */
public class Map {
	private double latitude;
	private double longitude;

	/**
	 * @return A latitude
	 */
	public final double getLatitude() {
		return latitude;
	}

	/**
	 * @return A longitude
	 */
	public final double getLongitude() {
		return longitude;
	}

	/**
	 * Define a latitude de uma posição geográfica
	 * 
	 * @param latitude
	 */
	public final void setLatitude( double latitude ) {
		this.latitude = latitude;
	}

	/**
	 * Define a longitude de uma posição geográfica
	 * 
	 * @param longitude
	 */
	public final void setLongitude( double longitude ) {
		this.longitude = longitude;
	}
}