package com.gilbarco.ws.business.agent;

public interface IBusinessServiceAgent <T> {

	/**
	 * Performs a business call and gets a response in the specific form (as an instance of specific class). 
	 * @return generic T
	 */
	public T getResponse();
	
}
