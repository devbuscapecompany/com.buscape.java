/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

/**
 * @brief Representação dos detalhes da resposta
 */
public class ResultDetails {
	private String applicationId;
	private String applicationPath;
	private String applicationVersion;
	private int code;
	private String date;
	private long elapsedTime;
	private String message;
	private String status;

	/**
	 * @return the applicationId
	 */
	public final String getApplicationId() {
		return applicationId;
	}

	/**
	 * @return the applicationPath
	 */
	public final String getApplicationPath() {
		return applicationPath;
	}

	/**
	 * @return the applicationVersion
	 */
	public final String getApplicationVersion() {
		return applicationVersion;
	}

	/**
	 * @return the code
	 */
	public final int getCode() {
		return code;
	}

	/**
	 * @return the date
	 */
	public final String getDate() {
		return date;
	}

	/**
	 * @return the elapsedTime
	 */
	public final long getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * @return the message
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @return the status
	 */
	public final String getStatus() {
		return status;
	}

	/**
	 * @param applicationId
	 *            the applicationId to set
	 */
	public final void setApplicationId( String applicationId ) {
		this.applicationId = applicationId;
	}

	/**
	 * @param applicationPath
	 *            the applicationPath to set
	 */
	public final void setApplicationPath( String applicationPath ) {
		this.applicationPath = applicationPath;
	}

	/**
	 * @param applicationVersion
	 *            the applicationVersion to set
	 */
	public final void setApplicationVersion( String applicationVersion ) {
		this.applicationVersion = applicationVersion;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public final void setCode( int code ) {
		this.code = code;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public final void setDate( String date ) {
		this.date = date;
	}

	/**
	 * @param elapsedTime
	 *            the elapsedTime to set
	 */
	public final void setElapsedTime( long elapsedTime ) {
		this.elapsedTime = elapsedTime;
	}

	/**
	 * @param message the message to set
	 */
	public final void setMessage( String message ) {
		this.message = message;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public final void setStatus( String status ) {
		this.status = status;
	}
}