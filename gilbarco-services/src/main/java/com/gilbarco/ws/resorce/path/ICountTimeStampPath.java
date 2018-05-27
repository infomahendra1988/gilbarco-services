package com.gilbarco.ws.resorce.path;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gilbarco.ws.common.WSPath;
import com.gilbarco.ws.common.WSWebApplicationException;
import com.gilbarco.ws.jaxb.model.timestamp.TimeStampModel;

/**
 * @author Mahendra
 */

public interface ICountTimeStampPath {
	
	/**
	 * Retrieves Time Stamp and total request count.
	 * 
	 * @return TimeStampModel
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON+ ";qs=0.9"}) //qs=0.9 means accept other data format also as low priority.
	@Path(WSPath.METHOD_GET_COUNT_TIME_STAMP_REQUEST)
	public TimeStampModel getTimeStampCountRequest();

}
