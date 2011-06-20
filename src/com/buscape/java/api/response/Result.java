/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.List;

/**
 * @brief Representação do resultado da chamada de uma operação
 */
public class Result {
	private String match;
	private int totalResultsReturned;
	private int totalResultsAvailable;
	private int totalResultsSellers;
	private int page;
	private int totalPages;
	private ResultDetails details;
	private Category category;
	private List<Category> subCategory;
	private List<Category> top5Category;
	private List<Product> product;
	private List<Offer> offer;
	private Seller seller;

	/**
	 * @return the category
	 */
	public final Category getCategory() {
		return category;
	}

	/**
	 * @return the details
	 */
	public final ResultDetails getDetails() {
		return details;
	}

	/**
	 * @return the match
	 */
	public final String getMatch() {
		return match;
	}

	/**
	 * @return the offer
	 */
	public final List<Offer> getOffer() {
		return offer;
	}

	/**
	 * @return the page
	 */
	public final int getPage() {
		return page;
	}

	/**
	 * @return the product
	 */
	public final List<Product> getProduct() {
		return product;
	}

	/**
	 * @return the seller
	 */
	public final Seller getSeller() {
		return seller;
	}

	/**
	 * @return the subCategory
	 */
	public final List<Category> getSubCategory() {
		return subCategory;
	}

	/**
	 * @return the top5Category
	 */
	public final List<Category> getTop5Category() {
		return top5Category;
	}

	/**
	 * @return the totalPages
	 */
	public final int getTotalPages() {
		return totalPages;
	}

	/**
	 * @return the totalResultsAvailable
	 */
	public final int getTotalResultsAvailable() {
		return totalResultsAvailable;
	}

	/**
	 * @return the totalResultsReturned
	 */
	public final int getTotalResultsReturned() {
		return totalResultsReturned;
	}

	/**
	 * @return the totalResultsSellers
	 */
	public final int getTotalResultsSellers() {
		return totalResultsSellers;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public final void setCategory( Category category ) {
		this.category = category;
	}

	/**
	 * @param $details
	 *            the details to set
	 */
	public final void setDetails( ResultDetails details ) {
		this.details = details;
	}

	/**
	 * @param match
	 *            the match to set
	 */
	public final void setMatch( String match ) {
		this.match = match;
	}

	/**
	 * @param offer
	 *            the offer to set
	 */
	public final void setOffer( List<Offer> offer ) {
		this.offer = offer;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public final void setPage( int page ) {
		this.page = page;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public final void setProduct( List<Product> product ) {
		this.product = product;
	}

	/**
	 * @param seller
	 *            the seller to set
	 */
	public final void setSeller( Seller seller ) {
		this.seller = seller;
	}

	/**
	 * @param subCategory
	 *            the subCategory to set
	 */
	public final void setSubCategory( List<Category> subCategory ) {
		this.subCategory = subCategory;
	}

	/**
	 * @param top5Category
	 *            the top5Category to set
	 */
	public final void setTop5Category( List<Category> top5Category ) {
		this.top5Category = top5Category;
	}

	/**
	 * @param totalPages
	 *            the totalPages to set
	 */
	public final void setTotalPages( int totalPages ) {
		this.totalPages = totalPages;
	}

	/**
	 * @param totalResultsAvailable
	 *            the totalResultsAvailable to set
	 */
	public final void setTotalResultsAvailable( int totalResultsAvailable ) {
		this.totalResultsAvailable = totalResultsAvailable;
	}

	/**
	 * @param totalResultsReturned
	 *            the totalResultsReturned to set
	 */
	public final void setTotalResultsReturned( int totalResultsReturned ) {
		this.totalResultsReturned = totalResultsReturned;
	}

	/**
	 * @param totalResultsSellers the totalResultsSellers to set
	 */
	public final void setTotalResultsSellers( int totalResultsSellers ) {
		this.totalResultsSellers = totalResultsSellers;
	}
}