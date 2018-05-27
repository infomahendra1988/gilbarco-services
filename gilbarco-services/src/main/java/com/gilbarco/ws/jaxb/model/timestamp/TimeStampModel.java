package com.gilbarco.ws.jaxb.model.timestamp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gilbarco.ws.jaxb.versioned.WsImplementationVersion;
/**
 * 
 * @author Mahendra
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
})
@XmlRootElement(name = "gvr-time-stamp-count")
@WsImplementationVersion("1.0")
public class TimeStampModel {

	@XmlElement(name = "gvr-request-count")
	protected Integer requestCount;
	@XmlElement(name = "gvr-current-time-stamp")
	protected String currentTimeStamp;
	
	
	public Integer getRequestCount() {
		return requestCount;
	}
	public void setRequestCount(Integer requestCount) {
		this.requestCount = requestCount;
	}
	public String getCurrentTimeStamp() {
		return currentTimeStamp;
	}
	public void setCurrentTimeStamp(String currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}
	
	

}
