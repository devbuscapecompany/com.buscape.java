/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.List;

/**
 * @brief Representação da avaliação média dos usuários
 */
public class UserAverageRating {
	private List<Link> links;
	private int numComments;
	private double rating;
	private Specification specification;

	/**
	 * @return the links
	 */
	public final List<Link> getLinks() {
		return links;
	}

	/**
	 * @return the numComments
	 */
	public final int getNumComments() {
		return numComments;
	}

	/**
	 * @return the rating
	 */
	public final double getRating() {
		return rating;
	}

	/**
	 * @return the specification
	 */
	public final Specification getSpecification() {
		return specification;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public final void setLinks( List<Link> links ) {
		this.links = links;
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
	public final void setRating( double rating ) {
		this.rating = rating;
	}

	/**
	 * @param specification
	 *            the specification to set
	 */
	public final void setSpecification( Specification specification ) {
		this.specification = specification;
	}
}