/**
 * @brief	Classes relacionadas com a API Lomadee
 * @package	com.buscape.java.api.lomadee
 */
package com.buscape.java.api.lomadee;

import com.buscape.java.api.APIInterface;
import com.buscape.java.api.APIOperation;

/**
 * @brief Operação findOfferList
 * @details Essa classe representa a operação findOfferList da API do Lomadee.
 * 
 *          Listagem das ofertas disponíveis apenas na Lomadee, por exemplo,
 *          notebooks da Dell / Saraiva, livros da Saraiva, etc.
 * 
 *          Toda a documentação do serviço findOfferList da API BuscaPé se
 *          aplica ao serviço findOfferList da API Lomadee. Possui os mesmos
 *          filtros, os mesmos resultados, etc, porém os links são CPA. Na API
 *          BuscaPé o mesmo serviço de ofertas, os links são CPC, sendo a única
 *          diferença entre os serviços.
 */
public class LomadeeFindOfferListOperation extends APIOperation {
	private String barcode;
	private int categoryId;
	private String keyword;
	private int productId;

	/**
	 * @param apiInterface
	 */
	public LomadeeFindOfferListOperation( APIInterface apiInterface ) {
		super( apiInterface );
	}

	/**
	 * @return O código de barras
	 */
	public final String getBarcode() {
		return barcode;
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
		return "/service/findOfferList/lomadee/";
	}

	/**
	 * @return O id do produto
	 */
	public final int getProductId() {
		return productId;
	}

	/**
	 * @param barcode
	 *            O código de barras
	 */
	public final void setBarcode( String barcode ) {
		setParam( "barcode" , barcode );
		this.barcode = barcode;
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
	 *            A palavra chave
	 */
	public final void setKeyword( String keyword ) {
		setParam( "keyword" , keyword );
		this.keyword = keyword;
	}

	/**
	 * @param productId
	 *            O id do produto
	 */
	public final void setProductId( int productId ) {
		setParam( "productId" , Integer.toString( productId ) );
		this.productId = productId;
	}
}