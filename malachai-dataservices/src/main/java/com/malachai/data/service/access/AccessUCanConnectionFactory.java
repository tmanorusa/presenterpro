/**
 * AccessUCanConnectionFactory.java
 */
package com.malachai.data.service.access;

import java.sql.Connection;
import java.sql.DriverManager;

import com.malachai.data.service.ConnectionFactory;

import net.ucanaccess.jdbc.UcanaccessDriver;

/**
 * @author Tom
 *
 */
public class AccessUCanConnectionFactory implements ConnectionFactory {

	public AccessUCanConnectionFactory() {
	}
	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			// Load MS acccess driver class
			Class.forName( "net.ucanaccess.jdbc.UcanaccessDriver" );
			String url = UcanaccessDriver.URL_PREFIX+"C:/Malachai/presenterpro/data/presenterpro.legacy.mdb;memory=false";

			// specify url, username, pasword - make sure these are valid 
			conn = DriverManager.getConnection( url, "", "" );
			if ( conn != null ) {
				System.out.println( "Connection Successful" );
				//conn.close();
				
			}else {
				System.out.println( "Connection failed" );
			}
			
		} catch ( Exception e ) {
			System.err.println( "Got an exception!" );
			System.err.println( e.getMessage() );
			e.printStackTrace();

		}
		return conn;
	}
}
