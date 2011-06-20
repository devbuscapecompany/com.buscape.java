/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.List;

/**
 * @brief Representação de um produto
 */
public class Product {
	private int categoryId;
	private String currency;
	private boolean eco;
	private boolean fullDescription;
	private boolean hasMetaSearch;
	private int id;
	private List<Link> links;
	private double priceMax;
	private double priceMin;
	private String productName;
	private String productShortName;
	private Rating rating;
	private Thumbnail thumbnail;
	private int totalSellers;
	private Specification specification;

	/**
	 * @return the categoryId
	 */
	public final int getCategoryId() {
		return categoryId;
	}

	/**
	 * @return the currency
	 */
	public final String getCurrency() {
		return currency;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the links
	 */
	public final List<Link> getLinks() {
		return links;
	}

	/**
	 * @return the priceMax
	 */
	public final double getPriceMax() {
		return priceMax;
	}

	/**
	 * @return the priceMin
	 */
	public final double getPriceMin() {
		return priceMin;
	}

	/**
	 * @return the productName
	 */
	public final String getProductName() {
		return productName;
	}

	/**
	 * @return the productShortName
	 */
	public final String getProductShortName() {
		return productShortName;
	}

	/**
	 * @return the rating
	 */
	public final Rating getRating() {
		return rating;
	}

	/**
	 * @return the specification
	 */
	public final Specification getSpecification() {
		return specification;
	}

	/**
	 * @return the thumbnail
	 */
	public final Thumbnail getThumbnail() {
		return thumbnail;
	}

	/**
	 * @return the totalSellers
	 */
	public final int getTotalSellers() {
		return totalSellers;
	}

	/**
	 * @return the eco
	 */
	public final boolean isEco() {
		return eco;
	}

	/**
	 * @return the fullDescription
	 */
	public final boolean isFullDescription() {
		return fullDescription;
	}

	/**
	 * @return the hasMetaSearch
	 */
	public final boolean isHasMetaSearch() {
		return hasMetaSearch;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public final void setCategoryId( int categoryId ) {
		this.categoryId = categoryId;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public final void setCurrency( String currency ) {
		this.currency = currency;
	}

	/**
	 * @param eco
	 *            the eco to set
	 */
	public final void setEco( boolean eco ) {
		this.eco = eco;
	}

	/**
	 * @param fullDescription
	 *            the fullDescription to set
	 */
	public final void setFullDescription( boolean fullDescription ) {
		this.fullDescription = fullDescription;
	}

	/**
	 * @param hasMetaSearch
	 *            the hasMetaSearch to set
	 */
	public final void setHasMetaSearch( boolean hasMetaSearch ) {
		this.hasMetaSearch = hasMetaSearch;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId( int id ) {
		this.id = id;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public final void setLinks( List<Link> links ) {
		this.links = links;
	}

	/**
	 * @param d
	 *            the priceMax to set
	 */
	public final void setPriceMax( double d ) {
		priceMax = d;
	}

	/**
	 * @param priceMin
	 *            the priceMin to set
	 */
	public final void setPriceMin( double priceMin ) {
		this.priceMin = priceMin;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public final void setProductName( String productName ) {
		this.productName = productName;
	}

	/**
	 * @param productShortName
	 *            the productShortName to set
	 */
	public final void setProductShortName( String productShortName ) {
		this.productShortName = productShortName;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public final void setRating( Rating rating ) {
		this.rating = rating;
	}

	/**
	 * @param specification
	 *            the specification to set
	 */
	public final void setSpecification( Specification specification ) {
		this.specification = specification;
	}

	/**
	 * @param thumbnail
	 *            the thumbnail to set
	 */
	public final void setThumbnail( Thumbnail thumbnail ) {
		this.thumbnail = thumbnail;
	}

	/**
	 * @param totalSellers the totalSellers to set
	 */
	public final void setTotalSellers( int totalSellers ) {
		this.totalSellers = totalSellers;
	}
}