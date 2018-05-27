package com.gilbarco.ws.business.agent;

import java.time.DateTimeException;

import javax.ws.rs.core.Response.Status;

import com.gilbarco.ws.common.TimeStampUtil;
import com.gilbarco.ws.common.WSConstants;
import com.gilbarco.ws.common.WSWebApplicationException;
import com.gilbarco.ws.jaxb.model.timestamp.TimeStampModel;

/**
 * 
 * @author Mahendra
 *
 */

public class CountTimeStampAgent implements IBusinessServiceAgent<TimeStampModel> {

	private static Integer count = 0;

	/**
	 * This business method retrun timestamp model inside contain request count
	 * and current time stamp.
	 * 
	 * return TimeStampModel
	 */
	public TimeStampModel getResponse() {

		TimeStampModel timeStampModel = new TimeStampModel();
		// TODO && currently we are not contact with database or any other third party service.
		// we completed requirement by using static Integer and current date by specific date and time format.
		
		try{
			timeStampModel.setCurrentTimeStamp(TimeStampUtil.getCurrentTime(WSConstants.TIME_STAMP_FORMAT));
			timeStampModel.setRequestCount(++count);
		}catch (IllegalArgumentException e) {
			throw new WSWebApplicationException(WSConstants.FAILURE+" wrong time stamp format found. format found "+WSConstants.TIME_STAMP_FORMAT, Status.EXPECTATION_FAILED);
		}

		return timeStampModel;
	}

}
