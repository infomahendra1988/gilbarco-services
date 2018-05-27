package com.gilbarco.ws.common;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.gilbarco.ws.jaxb.model.error.ErrorModel;



/**
 * WebApplicationException sub-class which builds ErrorModel XML entity into response.
 */
public class WSWebApplicationException extends WebApplicationException {
	private static final long serialVersionUID = 5570516743842132725L;

	/**
	 * this constructor accept 2 parameter errorModel and status code generate application exception.
	 * 
	 * @param errorModel
	 * @param status
	 */
	public WSWebApplicationException(ErrorModel errorModel, Status status) {
		super(Response.status(status).type(MediaType.APPLICATION_XML).entity(errorModel)
				.build());
	}

	/**
	 * this another type of constructor for generate application exception object.
	 * 
	 * @param errorMessage
	 * @param status
	 */
	public WSWebApplicationException(String errorMessage, Status status) {
		super(Response.status(status).type(MediaType.APPLICATION_XML).entity(
				new ErrorModel(
						status != null ? status.getStatusCode() : null, 
						WSConstants.ERROR, errorMessage, 
						null, null))
				.build());
	}
	//TODO && we can create another type of application exception object generation.
	
}