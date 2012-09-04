/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Lista de produtos
 * @details Essa classe representa a operação findProductList da API do BuscaPé.
 */
public class BuscapeFindProductListOperation extends APIOperation {
	private int categoryId;
	private String keyword;

	/**
	 * @param apiInterface
	 */
	public BuscapeFindProductListOperation( APIInterface apiInterface ) {
		super( apiInterface );
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
		return "/service/findProductList/";
	}

	/**
	 * @param categoryId O id da categoria
	 * @return Interface fluente BuscapeFindProductListOperation 
	 */
	public final BuscapeFindProductListOperation setCategoryId( int categoryId ) {
		setParam( "categoryId" , Integer.toString( categoryId ) );
		this.categoryId = categoryId;
		return this;
		
	}

	/**
	 * @param keyword A palavra chave
	 * @return Interface fluente BuscapeFindProductListOperation 
	 */
	public final BuscapeFindProductListOperation setKeyword( String keyword ) {
		setParam( "keyword" , keyword );
		this.keyword = keyword;
		return this;
		
	}
	
	/**
	 * @brief Define a ordenação como menor preço
	 * @return Interface fluente BuscapeFindProductListOperation
	 */
	public BuscapeFindProductListOperation sortByPrice() {
		setParam("sort", "price");
		return this;
		
	}
	
}
