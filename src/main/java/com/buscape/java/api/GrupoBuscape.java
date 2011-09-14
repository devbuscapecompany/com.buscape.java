/**
 * @brief	Pacote base da biblioteca do grupo BuscaPé
 * @details	Esse pacote contém as classes e interfaces necessárias para
 * 			integração com as APIs do Grupo BuscaPé.
 * @package	com.buscape.java.api
 */
package com.buscape.java.api;

import com.buscape.java.api.buscape.BuscapeAPI;
import com.buscape.java.api.lomadee.LomadeeAPI;

/**
 * @brief Interface para acesso às APIs do Grupo BuscaPé.
 * @details A classe GrupoBuscape define uma interface para se criar objetos de
 *          integração com as várias APIs do Grupo BuscaPé.
 * 
 *          Essa classe configura o objeto de integração, diminuindo a
 *          dificuldade de implementação de uma integração com a API escolhida.
 */
public class GrupoBuscape {
	private final String applicationId;
	private boolean sandbox = false;

	/**
	 * @brief Construtor do objeto de interface GrupoBuscape
	 * @details Constroi o objeto que engloba todas as APIs do Grupo BuscaPé
	 *          para acesso às APIs do Grupo BuscaPé
	 * @param $applicationId
	 *            ID da aplicação
	 */
	public GrupoBuscape( String applicationId ) {
		this.applicationId = applicationId;
	}

	/**
	 * @brief API BuscaPé
	 * @details Recupera o objeto de integração com a API do BuscaPé.
	 * @return O objeto que representa a API do BuscaPé
	 */
	public BuscapeAPI buscape() {
		return (BuscapeAPI) prepare( new BuscapeAPI() );
	}

	/**
	 * @brief API Lomadee
	 * @details Recupera o objeto de integração com a API do Lomadee.
	 * @return O objeto que representa a API do Lomadee
	 */
	public LomadeeAPI lomadee() {
		return (LomadeeAPI) prepare( new LomadeeAPI() );
	}

	private APIInterface prepare( APIInterface apiInterface ) {
		apiInterface.setApplicationId( applicationId );
		apiInterface.setSandbox( sandbox );

		return apiInterface;
	}

	/**
	 * @brief Ambiente Sandbox
	 * @details Define que será utilizado o ambiente sandbox para testes de
	 *          integração com uma API do Grupo BuscaPé.
	 * @return GrupoBuscape
	 */
	public GrupoBuscape sandbox() {
		sandbox = true;

		return this;
	}
}