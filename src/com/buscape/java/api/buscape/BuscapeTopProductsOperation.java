/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Produtos populares
 * @details Essa classe representa a operação topProducts da API do BuscaPé.
 */
public class BuscapeTopProductsOperation extends APIOperation {
	/**
	 * @param apiInterface
	 */
	public BuscapeTopProductsOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	@Override
	protected String getOperationPath() {
		return "/service/topProducts/";
	}
}