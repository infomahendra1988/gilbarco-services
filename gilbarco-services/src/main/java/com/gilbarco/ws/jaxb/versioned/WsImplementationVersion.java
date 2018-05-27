package com.gilbarco.ws.jaxb.versioned;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Mahendra
 * 
 * this is provide a information for development version.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WsImplementationVersion {
	 String value();
}

