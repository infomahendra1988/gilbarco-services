package com.gilbarco.ws.resource;

import javax.ws.rs.Path;

import com.gilbarco.ws.business.agent.CountTimeStampAgent;
import com.gilbarco.ws.business.agent.IBusinessServiceAgent;
import com.gilbarco.ws.common.WSPath;
import com.gilbarco.ws.common.WSWebApplicationException;
import com.gilbarco.ws.jaxb.model.timestamp.TimeStampModel;
import com.gilbarco.ws.resorce.path.ICountTimeStampPath;

@Path(WSPath.RESOURCE_COUNT_TIME_STAMP_REQUEST)
public class CountTimeStampResource implements ICountTimeStampPath{
/**
 * @author Mahendra
 */
public TimeStampModel getTimeStampCountRequest() throws WSWebApplicationException{
		
		IBusinessServiceAgent<TimeStampModel> serviceAgent = new CountTimeStampAgent();
		// TODO && add validation for validate data and user information but in this service we are not introducing.
		return serviceAgent.getResponse();
		
	}

}
