/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.List;

/**
 * @brief Representação de uma categoria
 */
public class Category {
	private List<Filter> filters;
	private boolean hasOffer;
	private int id;
	private boolean isFinal;
	private List<Link> links;
	private String name;
	private int parentCategoryId;
	private Thumbnail thumbnail;

	/**
	 * @return the filters
	 */
	public final List<Filter> getFilters() {
		return filters;
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
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the parentCategoryId
	 */
	public final int getParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * @return the thumbnail
	 */
	public final Thumbnail getThumbnail() {
		return thumbnail;
	}

	/**
	 * @return the isFinal
	 */
	public final boolean isFinal() {
		return isFinal;
	}

	/**
	 * @return the hasOffer
	 */
	public final boolean isHasOffer() {
		return hasOffer;
	}

	/**
	 * @param filters
	 *            the filters to set
	 */
	public final void setFilters( List<Filter> filters ) {
		this.filters = filters;
	}

	/**
	 * @param isFinal
	 *            the isFinal to set
	 */
	public final void setFinal( boolean isFinal ) {
		this.isFinal = isFinal;
	}

	/**
	 * @param hasOffer
	 *            the hasOffer to set
	 */
	public final void setHasOffer( boolean hasOffer ) {
		this.hasOffer = hasOffer;
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
	 * @param name
	 *            the name to set
	 */
	public final void setName( String name ) {
		this.name = name;
	}

	/**
	 * @param parentCategoryId
	 *            the parentCategoryId to set
	 */
	public final void setParentCategoryId( int parentCategoryId ) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * @param thumbnail
	 *            the thumbnail to set
	 */
	public final void setThumbnail( Thumbnail thumbnail ) {
		this.thumbnail = thumbnail;
	}
}