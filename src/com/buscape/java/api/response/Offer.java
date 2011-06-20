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
 * @brief Representação de uma oferta
 */
public class Offer {
	private int categoryId;
	private int id;
	private List<Link> links;
	private String offerName;
	private OfferPrice price;
	private int productId;
	private Seller seller;
	private Thumbnail thumbnail;

	/**
	 * @return the categoryId
	 */
	public final int getCategoryId() {
		return categoryId;
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
		if ( links == null ) {
			links = new ArrayList<Link>();
		}

		return links;
	}

	/**
	 * @return the offerName
	 */
	public final String getOfferName() {
		return offerName;
	}

	/**
	 * @return the price
	 */
	public final OfferPrice getPrice() {
		return price;
	}

	/**
	 * @return the productId
	 */
	public final int getProductId() {
		return productId;
	}

	/**
	 * @return the seller
	 */
	public final Seller getSeller() {
		return seller;
	}

	/**
	 * @return the thumbnail
	 */
	public final Thumbnail getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public final void setCategoryId( int categoryId ) {
		this.categoryId = categoryId;
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
	 * @param offerName
	 *            the offerName to set
	 */
	public final void setOfferName( String offerName ) {
		this.offerName = offerName;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public final void setPrice( OfferPrice price ) {
		this.price = price;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public final void setProductId( int productId ) {
		this.productId = productId;
	}

	/**
	 * @param seller
	 *            the seller to set
	 */
	public final void setSeller( Seller seller ) {
		this.seller = seller;
	}

	/**
	 * @param thumbnail
	 *            the thumbnail to set
	 */
	public final void setThumbnail( Thumbnail thumbnail ) {
		this.thumbnail = thumbnail;
	}
}