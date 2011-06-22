/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Operação findProductList
 * @details Essa classe representa a operação findProductList da API do Lomadee.
 * 
 *          Listagem dos produtos (PUs) disponíveis apenas na Lomadee, por
 *          exemplo, notebooks da Dell / Saraiva, livros da Saraiva, etc.
 * 
 *          Toda a documentação do serviço findProductList da API BuscaPé se
 *          aplica ao serviço findProductList da API Lomadee. Possui os mesmos
 *          filtros, os mesmos resultados, etc
 */
public class LomadeeFindProductListOperation extends APIOperation {
	private int categoryId;
	private String keyword;

	/**
	 * @param apiInterface
	 */
	public LomadeeFindProductListOperation( APIInterface apiInterface ) {
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
		return "/service/findProductList/lomadee/";
	}

	/**
	 * @param categoryId O id da categoria
	 */
	public final void setCategoryId( int categoryId ) {
		setParam( "categoryId" , Integer.toString( categoryId ) );
		this.categoryId = categoryId;
	}

	/**
	 * @param keyword A palavra chave
	 */
	public final void setKeyword( String keyword ) {
		setParam( "keyword" , keyword );
		this.keyword = keyword;
	}
}