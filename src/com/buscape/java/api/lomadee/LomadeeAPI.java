/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;

/**
 * @brief API Lomadee
 * @details A API (Interface de Programação de Aplicativos) da Lomadee é um
 *          conjunto de funções e padrões estabelecidos para criação de
 *          aplicativos customizados, em que há necessidade de uso da base de
 *          dados de produtos, ofertas e serviços oferecidos pela Lomadee.
 */
public class LomadeeAPI extends APIInterface {
	/**
	 * @brief Criar sourceId (código) para o Publisher
	 * @details Cria um objeto que representa a operação createSource para
	 *          criação de um sourceIf (código) para o Publisher.
	 * @return O objeto que representa a operação createSource
	 */
	public LomadeeCreateSourceOperation createSource() {
		return new LomadeeCreateSourceOperation( this );
	}

	/**
	 * @brief Lista de anunciantes
	 * @details Cria um objeto que representa a operação findAdvertiserList.
	 * @return O objeto que representa a operação findAdvertiserList
	 */
	public LomadeeFindAdvertiserListOperation findAdvertiserList() {
		return new LomadeeFindAdvertiserListOperation( this );
	}

	/**
	 * @brief Lista de categorias
	 * @details Cria um objeto que representa uma operação findCategoryList.
	 * @return O objeto que representa a operação findCategoryList
	 */
	public LomadeeFindCategoryListOperation findCategoryList() {
		return new LomadeeFindCategoryListOperation( this );
	}

	/**
	 * @brief Lista de ofertas
	 * @details Cria um objeto que representa uma operação findOfferList.
	 * @return O objeto que representa a operação findOfferList
	 */
	public LomadeeFindOfferListOperation findOfferList() {
		return new LomadeeFindOfferListOperation( this );
	}

	/**
	 * @brief Lista de produtos
	 * @details Cria um objeto que representa a operação findProductList.
	 * @return O objeto que representa a operação findProductList
	 */
	public LomadeeFindProductListOperation findProductList() {
		return new LomadeeFindProductListOperation( this );
	}
}