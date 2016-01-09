/**
 * DataServiceException.java
 */
package com.malachai.data.service;

/**
 * DataServiceException.  Exception class to represent exceptions associated with processes that 
 * involve data services.
 * 
 * @author Tom
 *
 */
public class DataServiceException extends Exception {

	private static final long serialVersionUID = -1811273286922528848L;

	/**
	 * Default constructor.
	 */
	public DataServiceException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DataServiceException( String message, Throwable cause ) {
		super( message, cause );
	}

	/**
	 * @param message
	 */
	public DataServiceException( String message ) {
		super( message );
	}

	/**
	 * @param cause
	 */
	public DataServiceException( Throwable cause ) {
		super( cause );
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DataServiceException( String message,
								 Throwable cause,
								 boolean enableSuppression,
								 boolean writableStackTrace ) {
		super( message, cause, enableSuppression, writableStackTrace );
	}
}
