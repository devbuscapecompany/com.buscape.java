/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Detalhes de vendedores
 * @details Essa classe representa a operação viewSellerDetails da API do
 *          BuscaPé.
 */
public class BuscapeViewSellerDetailsOperation extends APIOperation {
	private int sellerId;

	/**
	 * @param apiInterface
	 */
	public BuscapeViewSellerDetailsOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	@Override
	protected String getOperationPath() {
		return "/service/viewSellerDetails/";
	}

	/**
	 * @return the sellerId
	 */
	public final int getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public final void setSellerId( int sellerId ) {
		this.sellerId = sellerId;
	}
}