package com.malachai.test.data.service;

import java.sql.Connection;
import java.sql.DriverManager;

import net.ucanaccess.jdbc.UcanaccessDriver;

public class AccessUCanConnectionFactory {

	public AccessUCanConnectionFactory() {
	}
	
	public void getConnection() {
		try {
			// Load MS accces driver class
			Class.forName( "net.ucanaccess.jdbc.UcanaccessDriver" );
			String url = UcanaccessDriver.URL_PREFIX+"C:/Malachai/presenterpro/data/presenterpro.legacy.mdb;memory=false";

			// specify url, username, pasword - make sure these are valid 
			Connection conn = DriverManager.getConnection( url, "", "" );
			if ( conn != null ) {
				System.out.println( "Connection Successful" );
				conn.close();
			}else {
				System.out.println( "Connection failed" );
			}
			
		} catch ( Exception e ) {
			System.err.println( "Got an exception!" );
			System.err.println( e.getMessage() );
			e.printStackTrace();

		}
	}
}
