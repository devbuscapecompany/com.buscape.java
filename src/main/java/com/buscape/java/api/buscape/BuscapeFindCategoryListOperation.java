/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Lista de categorias
 * @details Essa classe representa a operação findCategoryList da API do
 *          BuscaPé.
 * 
 *          O serviço de procura de categorias permite que sejam exibidas
 *          informações relativas às categorias. É possível obter categorias,
 *          produtos ou ofertas informando apenas um ID de categoria.
 * 
 *          Existem três tipos de categorias:
 * 
 * @li Categoria raiz - É o primeiro nível da árvore. Através dela obtemos as
 *     subcategorias.
 * @li Subcategoria - É o segundo nível da árvore, em que podemos obter outras
 *     subcategorias ou categorias finais.
 * @li Categoria final - É o último nível da árvore, estando relacionado a uma
 *     lista de produtos, ofertas ou serviços.
 */
public class BuscapeFindCategoryListOperation extends APIOperation {
	private int categoryId;
	private String keyword;

	/**
	 * @param apiInterface
	 */
	public BuscapeFindCategoryListOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	/**
	 * @return O id da categoria
	 */
	public final int getCategoryId() {
		return categoryId;
	}

	/**
	 * @return a palavra chave
	 */
	public final String getKeyword() {
		return keyword;
	}

	@Override
	protected String getOperationPath() {
		return "/service/findCategoryList/";
	}

	/**
	 * @param categoryId
	 *            O id da categoria
	 */
	public final void setCategoryId( int categoryId ) {
		setParam( "categoryId" , Integer.toString( categoryId ) );
		this.categoryId = categoryId;
	}

	/**
	 * @param keyword
	 *            a palavra chave
	 */
	public final void setKeyword( String keyword ) {
		setParam( "keyword" , keyword );
		this.keyword = keyword;
	}
}