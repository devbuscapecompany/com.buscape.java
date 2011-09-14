/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.List;

/**
 * @brief Representação de um vendedor
 */
public class Seller {
	private boolean digitalPayment;
	private boolean isTrustedStore;
	private int id;
	private String sellerName;
	private Thumbnail thumbnail;
	private List<Link> links;
	private List<String> extra;
	private List<Contact> contacts;
	private Rating rating;
	private Coupon coupon;
	private List<Address> addresses;

	/**
	 * @return the addresses
	 */
	public final List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @return the contacts
	 */
	public final List<Contact> getContacts() {
		return contacts;
	}

	/**
	 * @return the coupon
	 */
	public final Coupon getCoupon() {
		return coupon;
	}

	/**
	 * @return the extra
	 */
	public final List<String> getExtra() {
		return extra;
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
	 * @return the rating
	 */
	public final Rating getRating() {
		return rating;
	}

	/**
	 * @return the sellerName
	 */
	public final String getSellerName() {
		return sellerName;
	}

	/**
	 * @return the thumbnail
	 */
	public final Thumbnail getThumbnail() {
		return thumbnail;
	}

	/**
	 * @return the digitalPayment
	 */
	public final boolean isDigitalPayment() {
		return digitalPayment;
	}

	/**
	 * @return the isTrustedStore
	 */
	public final boolean isTrustedStore() {
		return isTrustedStore;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public final void setAddresses( List<Address> addresses ) {
		this.addresses = addresses;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public final void setContacts( List<Contact> contacts ) {
		this.contacts = contacts;
	}

	/**
	 * @param coupon
	 *            the coupon to set
	 */
	public final void setCoupon( Coupon coupon ) {
		this.coupon = coupon;
	}

	/**
	 * @param digitalPayment
	 *            the digitalPayment to set
	 */
	public final void setDigitalPayment( boolean digitalPayment ) {
		this.digitalPayment = digitalPayment;
	}

	/**
	 * @param extra
	 *            the extra to set
	 */
	public final void setExtra( List<String> extra ) {
		this.extra = extra;
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
	 * @param rating
	 *            the rating to set
	 */
	public final void setRating( Rating rating ) {
		this.rating = rating;
	}

	/**
	 * @param sellerName
	 *            the sellerName to set
	 */
	public final void setSellerName( String sellerName ) {
		this.sellerName = sellerName;
	}

	/**
	 * @param thumbnail
	 *            the thumbnail to set
	 */
	public final void setThumbnail( Thumbnail thumbnail ) {
		this.thumbnail = thumbnail;
	}

	/**
	 * @param isTrustedStore the isTrustedStore to set
	 */
	public final void setTrustedStore( boolean isTrustedStore ) {
		this.isTrustedStore = isTrustedStore;
	}
}