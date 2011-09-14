/**
 * @brief	Classes relacionadas com a API BuscaPé
 * @package	com.buscape.java.api.buscape
 */
package com.buscape.java.api.buscape;

import com.buscape.java.api.APIInterface;

/**
 * @brief API BuscaPé
 * @details Essa classe representa a API Buscapé, com ela pode-se utilizar todas
 *          as operações para localizar ofertas de produtos, categorias
 *          informações sobre vendedores e opinião de clientes.
 */
public final class BuscapeAPI extends APIInterface {
	/**
	 * Cria um objeto que representa uma operação findCategoryList.
	 * 
	 * @return Operação findCategoryList
	 */
	public BuscapeFindCategoryListOperation findCategoryList() {
		return new BuscapeFindCategoryListOperation( this );
	}

	/**
	 * Cria um objeto que representa uma operação findOfferList.
	 * 
	 * @return Operação findOfferList
	 */
	public BuscapeFindOfferListOperation findOfferList() {
		return new BuscapeFindOfferListOperation( this );
	}

	/**
	 * Cria um objeto que representa a operação findProductList.
	 * 
	 * @return Operação findProductList
	 */
	public BuscapeFindProductListOperation findProductList() {
		return new BuscapeFindProductListOperation( this );
	}

	/**
	 * Cria um objeto que representa a operação topProducts.
	 * 
	 * @return Operação topProducts
	 */
	public BuscapeTopProductsOperation topProducts() {
		return new BuscapeTopProductsOperation( this );
	}

	/**
	 * Cria um objeto que representa a operação viewProductDetails.
	 * 
	 * @return Operação viewProductDetails
	 */
	public BuscapeViewProductDetailsOperation viewProductDetails() {
		return new BuscapeViewProductDetailsOperation( this );
	}

	/**
	 * Cria um objeto que representa a operação viewSellerDetails.
	 * 
	 * @return Operação viewSellerDetails
	 */
	public BuscapeViewSellerDetailsOperation viewSellerDetails() {
		return new BuscapeViewSellerDetailsOperation( this );
	}

	/**
	 * Cria um objeto que representa a operação viewUserRatings.
	 * 
	 * @return Operação viewUserRatings
	 */
	public BuscapeViewUserRatingsOperation viewUserRatings() {
		return new BuscapeViewUserRatingsOperation( this );
	}
}