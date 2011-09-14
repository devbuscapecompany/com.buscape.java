/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação de uma avaliação
 */
public class Rating {
	private EBitRating eBitRating;
	private UserAverageRating userAverageRating;

	/**
	 * @return the eBitRating
	 */
	public final EBitRating geteBitRating() {
		return eBitRating;
	}

	/**
	 * @return the userAverageRating
	 */
	public final UserAverageRating getUserAverageRating() {
		return userAverageRating;
	}

	/**
	 * @param eBitRating
	 *            the eBitRating to set
	 */
	public final void seteBitRating( EBitRating eBitRating ) {
		this.eBitRating = eBitRating;
	}

	/**
	 * @param userAverageRating
	 *            the userAverageRating to set
	 */
	public final void setUserAverageRating( UserAverageRating userAverageRating ) {
		this.userAverageRating = userAverageRating;
	}
}