/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Operação findCategoryList
 * @details Essa classe representa a operação findCategoryList da API do
 *          Lomadee.
 */
public class LomadeeFindCategoryListOperation extends APIOperation {
	private int categoryId;
	private String keyword;

	/**
	 * @param apiInterface
	 */
	public LomadeeFindCategoryListOperation( APIInterface apiInterface ) {
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
		return "/service/findCategoryList/lomadee/";
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