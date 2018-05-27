package com.gilbarco.ws.resource.junit;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Assert;
import org.junit.Test;

import com.gilbarco.ws.common.WSConstants;

public class CountTimeStampResourceJUnitTest extends AbstractJUnitTest {

	@Test
	public void testTimeStampCountRequestJSON() {

			Response response = getResponse(WSConstants.TIME_STAMP_DEST_URL,
					new String[] { MediaType.APPLICATION_JSON }, null);
			Assert.assertEquals(Status.OK.getStatusCode(),response.getStatus());
			response.close();
	}
	
	@Test
	public void testTimeStampCountRequestXML() {
			Response response = getResponse(WSConstants.TIME_STAMP_DEST_URL,
					new String[] { MediaType.APPLICATION_XML }, null);
			Assert.assertEquals(Status.OK.getStatusCode(),response.getStatus());
			response.close();
	}
	
	

}
