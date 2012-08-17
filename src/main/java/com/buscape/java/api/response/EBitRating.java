/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Avaliação do eBit
 */
public class EBitRating {
	private int numComments;
	private String rating;

	/**
	 * @return the numComments
	 */
	public final int getNumComments() {
		return numComments;
	}

	/**
	 * @return the rating
	 */
	public final String getRating() {
		return rating;
	}

	/**
	 * @param numComments
	 *            the numComments to set
	 */
	public final void setNumComments( int numComments ) {
		this.numComments = numComments;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public final void setRating( String rating ) {
		this.rating = rating;
	}
}