package com.gilbarco.ws.exception;



/**
 * 
 * @author Mahendra
 *
 */

public class WSConnectionException extends Throwable {
	private static final long serialVersionUID = 5647270100867815945L;

	public WSConnectionException() {
		super();
	}
	
	public WSConnectionException(String message) {
		super(message);
	}

	public WSConnectionException(Throwable cause) {
		super(cause);
	}

	public WSConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
