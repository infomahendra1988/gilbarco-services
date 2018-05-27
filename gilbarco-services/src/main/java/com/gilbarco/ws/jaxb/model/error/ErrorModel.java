package com.gilbarco.ws.jaxb.model.error;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mahendra
 */
@XmlRootElement
public class ErrorModel extends ErrorResponseModel{

	/**
	 * default constructor
	 */
	public ErrorModel() {}

	/**
	 * we create error model object below mentioning fields.
	 * 
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param originalRequest
	 * @param description
	 */
	public ErrorModel(
			int statusCode, 
			String errorCode, String errorMessage, 
			String originalRequest, 
			String description) {

		setStatusCode(statusCode);
		setErrorCode(errorCode);
		setErrorMessage(errorMessage);
		setOriginalRequest(originalRequest);
		setDescription(description);
	}
	
	// TODO && we can create other different parameter constructor as per business requirement.
	
	/**
	 * toString method override for getting error model data in logs.
	 */
	@Override
	public String toString() {
		return "{statusCode=" + statusCode + ", " + "errorCode=" + errorCode + ", " 
				+ "errorMessage=" + errorMessage + ", " 
				+ "originalRequest=" + originalRequest + ", " 
				+ "description=" + description +"}";
	}
}

