/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Avaliação de usuários
 * @details Essa classe representa a operação viewUserRatings da API do BuscaPé.
 */
public class BuscapeViewUserRatingsOperation extends APIOperation {
	private int productId;

	/**
	 * @param apiInterface
	 */
	public BuscapeViewUserRatingsOperation(APIInterface apiInterface) {
		super(apiInterface);
	}

	@Override
	protected String getOperationPath() {
		return "/service/viewUserRatings/";
	}

	/**
	 * @return the productId
	 */
	public final int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public final BuscapeViewUserRatingsOperation setProductId(int productId) {
		this.productId = productId;
		return this;
	}
}