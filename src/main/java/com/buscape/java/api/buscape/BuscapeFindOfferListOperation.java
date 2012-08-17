/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Lista de ofertas
 * @details Essa classe representa a operação findOfferList da API do BuscaPé.
 */
public class BuscapeFindOfferListOperation extends APIOperation {
	private String barcode;
	private int categoryId;
	private String keyword;
	private int productId;

	/**
	 * @param apiInterface
	 */
	public BuscapeFindOfferListOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	/**
	 * @return O código de barras
	 */
	public final String getBarcode() {
		return barcode;
	}

	/**
	 * @return O id da categoria
	 */
	public final int getCategoryId() {
		return categoryId;
	}

	/**
	 * @return A palavra chave
	 */
	public final String getKeyword() {
		return keyword;
	}

	@Override
	protected String getOperationPath() {
		return "/service/findOfferList/";
	}

	/**
	 * @return O id do produto
	 */
	public final int getProductId() {
		return productId;
	}

	/**
	 * @param barcode
	 *            O código de barras
	 * @return 
	 */
	public final BuscapeFindOfferListOperation setBarcode( String barcode ) {
		setParam( "barcode" , barcode );
		this.barcode = barcode;
		return this;
		
	}

	/**
	 * @param categoryId
	 *            O id da categoria
	 * @return 
	 */
	public final BuscapeFindOfferListOperation setCategoryId( int categoryId ) {
		setParam( "categoryId" , Integer.toString( categoryId ) );
		this.categoryId = categoryId;
		return this;
		
	}

	/**
	 * @param keyword
	 *            A palavra chave
	 * @return 
	 */
	public final BuscapeFindOfferListOperation setKeyword( String keyword ) {
		setParam( "keyword" , keyword );
		this.keyword = keyword;
		return this;
		
	}

	/**
	 * @param productId
	 *            O id do produto
	 */
	public final BuscapeFindOfferListOperation setProductId( int productId ) {
		setParam( "productId" , Integer.toString( productId ) );
		this.productId = productId;
		return this;
		
	}
	
	/**
	 * @brief Define a ordenação como menor preço
	 */
	public BuscapeFindOfferListOperation sortByPrice() {
		setParam("sort", "price");
		return this;
		
	}

}