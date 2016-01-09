package com.malachai.test.data.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccessODBCConnectionFactory {

	public AccessODBCConnectionFactory() {
	}
	
	public void getConnection() {
		try {
			// Load MS accces driver class
			Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );

			String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" +
					"C:\\Malachai\\presenterpro\\data\\presenterpro.legacy.mdb";

			// specify url, username, pasword - make sure these are valid 
			Connection conn = DriverManager.getConnection( url, "", "" );

			if ( conn != null ) {
				System.out.println( "Connection Successful" );
				conn.close();
			}else {
				System.out.println( "Connection Failed." );
			}
			
		} catch ( Exception e ) {
			System.err.println( "Got an exception!" );
			System.err.println( e.getMessage() );
			e.printStackTrace();

		}
	}
}
