package com.gilbarco.ws.common;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.core.Response;

/**
 * 
 * @author Mahendra
 *
 */

public class TimeStampUtil {
	
	private TimeStampUtil(){
		// write private method for avoid instantiation out of the class.
	}
	
	/**
	 * this method is provide current date time based on input format.
	 * @param dateFormat
	 * @return
	 */
	public static String getCurrentTime(String dateFormat){
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		return df.format(new Date());
	}
	
	/**
	 * this method written for print response data on console.
	 * 
	 * @param response
	 * @throws IOException 
	 */
	public static void printResponseData(Response response) throws IOException  {
		

		InputStream is = response.readEntity(InputStream.class);
	    try {
	        int i=0;    
            while((i=is.read())!=-1){    
             System.out.print((char)i);    
            }   
	    }finally {
	    	is.close();
		}
	}

}
