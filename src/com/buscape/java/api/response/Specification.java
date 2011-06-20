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
 * @brief Representação de uma especificação
 */
public class Specification {
	private List<Item> item;
	private List<Link> links;

	/**
	 * @param item
	 *            the item to be added
	 */
	public void addItem( Item item ) {
		getItem().add( item );
	}

	/**
	 * @return the item
	 */
	public final List<Item> getItem() {
		if ( item == null ) {
			item = new ArrayList<Item>();
		}

		return item;
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
	 * @param item
	 *            the item to set
	 */
	public final void setItem( List<Item> item ) {
		this.item = item;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public final void setLinks( List<Link> links ) {
		this.links = links;
	}
}