package com.gilbarco.ws.jaxb.model.error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlRootElement(name = "gvr-response-error")
@WsImplementationVersion("1.0")
public class ErrorResponseModel {

 @XmlElement(name = "gvr-status-code")
 protected int statusCode;
 @XmlElement(name = "gvr-error-code")
 protected String errorCode;
 @XmlElement(name = "gvr-error-message")
 protected String errorMessage;
 @XmlElement(name = "gvr-original-request")
 protected String originalRequest;
 @XmlElement(name = "gvr-description")
 protected String description;
 @XmlAttribute(name = "version")
 protected String version;

 /**
  * Gets the value of the statusCode property.
  * 
  */
 public int getStatusCode() {
     return statusCode;
 }

 /**
  * Sets the value of the statusCode property.
  * 
  */
 public void setStatusCode(int value) {
     this.statusCode = value;
 }

 /**
  * Gets the value of the errorCode property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getErrorCode() {
     return errorCode;
 }

 /**
  * Sets the value of the errorCode property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setErrorCode(String value) {
     this.errorCode = value;
 }

 /**
  * Gets the value of the errorMessage property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getErrorMessage() {
     return errorMessage;
 }

 /**
  * Sets the value of the errorMessage property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setErrorMessage(String value) {
     this.errorMessage = value;
 }

 /**
  * Gets the value of the originalRequest property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getOriginalRequest() {
     return originalRequest;
 }

 /**
  * Sets the value of the originalRequest property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setOriginalRequest(String value) {
     this.originalRequest = value;
 }

 /**
  * Gets the value of the description property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getDescription() {
     return description;
 }

 /**
  * Sets the value of the description property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setDescription(String value) {
     this.description = value;
 }

 /**
  * Gets the value of the version property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getVersion() {
     return version;
 }

 /**
  * Sets the value of the version property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setVersion(String value) {
     this.version = value;
 }

}

