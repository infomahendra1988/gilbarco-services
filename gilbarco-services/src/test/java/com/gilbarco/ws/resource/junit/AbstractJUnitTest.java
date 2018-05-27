package com.gilbarco.ws.resource.junit;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.message.MessageProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.gilbarco.ws.common.TimeStampUtil;
import com.gilbarco.ws.exception.WSConnectionException;

public abstract class AbstractJUnitTest {

	//private static final String BASE_URL = "https://gilbarco-services.herokuapp.com/";
	private static final String BASE_URL = "https://gilbarco-services.herokuapp.com/";

/**
 *  prepare response based on input data.
 * @param path
 * @param acceptTypes
 * @param method
 * @return
 */
	protected Response getResponse(String path, String[] acceptTypes, String method) {
		try {
			if (path != null && !path.isEmpty()) {
				Builder builder = getBuilder(path);
				if (builder == null) {
					throw new WSConnectionException("builder getting NULL Object");
				}
				builder.accept(acceptTypes);

				// TODO currntly we need only get request so we didn't build other methods based on method comming.
				Response response = builder.get();
				if (response != null) {
					System.out.println("[getResponse] successfully received response" + ", status [" + response.getStatus()+"]");
					printResponseData(response);
					System.out.println();
					return response;
				} else {
					System.out.println("[getResponse] response is NULL");
					throw new WSConnectionException(" [getResponse] Response Object getting NULL.");
				}
			} else {
				throw new WSConnectionException("[getResponse] WS url getting NULL or Empty String.");
			}
		} catch (WSConnectionException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * print response data.
	 * 
	 * @param response
	 */
	private void printResponseData(Response response) {
		try {
			
			TimeStampUtil.printResponseData(response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/**
 * Prepare Builder
 * 
 * @param path
 * @return
 * @throws WSConnectionException
 */
	private Builder getBuilder(String path) throws WSConnectionException {
		WebTarget webTarget = getWebTarget(path);
		if (webTarget == null) {
			throw new WSConnectionException("[getResponse] Web target not found");
		}
		return getWebTarget(path).request();
	}
/**
 * prepare webTarget Object
 * 
 * @param path
 * @return
 * @throws WSConnectionException
 */
	private WebTarget getWebTarget(String path) throws WSConnectionException {
		Client client = getClient();
		if (client == null) {
			throw new WSConnectionException("[getResponse] Client connection is closed.");
		}
		
		return client.target(BASE_URL).path(path);
	}

	/**
	 * prepare client object
	 * @return
	 * @throws WSConnectionException
	 */
	private Client getClient() throws WSConnectionException {

		ClientBuilder clientBuilder = getClientBuilder();

		if (clientBuilder == null) {
			throw new WSConnectionException("[getClient] clientBuilder getting issue clientBuilder object is NULL.");
		}

		Client client = clientBuilder.build();
		if(client==null){
			throw new WSConnectionException("[getClient] client build getting issue client object is NULL.");
		}
		client.register(JacksonJaxbJsonProvider.class);// json provider in client side.
		client.property(MessageProperties.XML_SECURITY_DISABLE, Boolean.TRUE);// to avoid JAXP XML security warning.

		return client;
	}
	/**
	 * prepare client builder
	 * 
	 * @return
	 */

	private ClientBuilder getClientBuilder() {
		return ClientBuilder.newBuilder();
	}

}
