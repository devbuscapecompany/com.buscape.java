/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Construtor da resposta
 * @details Interface para criação do objeto de resposta das requisições às APIs
 *          do grupo Buscapé.
 */
public abstract class ResponseBuilder {
	protected final Result result;

	public ResponseBuilder() {
		result = new Result();
	}

	/**
	 * @return O resultado da chamada de uma requisição
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * @param content
	 *            O conteúdo que será interpretado
	 * @return Esse mesmo objeto
	 */
	public abstract ResponseBuilder parse( String content );
}