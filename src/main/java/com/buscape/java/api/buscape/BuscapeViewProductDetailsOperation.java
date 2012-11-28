/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Detalhes de produtos
 * @details Essa classe representa a operação viewProductDetails da API do
 *          BuscaPé.
 */
public class BuscapeViewProductDetailsOperation extends APIOperation {
	private int productId;

	/**
	 * @param apiInterface
	 */
	public BuscapeViewProductDetailsOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	@Override
	protected String getOperationPath() {
		return "/service/viewProductDetails/";
	}

	/**
	 * @return the productId
	 */
	public final int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 * @return Interface fluente BuscapeViewProductDetailsOperation 
	 */
	public final BuscapeViewProductDetailsOperation setProductId( int productId ) {
		setParam("productId", Integer.toString(productId));
		this.productId = productId;
		return this;
		
	}
}
