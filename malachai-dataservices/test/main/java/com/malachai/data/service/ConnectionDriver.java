package com.malachai.data.service;
import java.sql.Connection;
import java.sql.SQLException;

import com.malachai.data.service.ConnectionFactory;
import com.malachai.data.service.DataConnectionFactoryService;
import com.malachai.data.service.DataServiceException;


public class ConnectionDriver {

	public ConnectionDriver() {
	}
	
	public void testConnection() {
		try {
			DataConnectionFactoryService connectionService = DataConnectionFactoryService.getInstance();
			ConnectionFactory factory = connectionService.getConnectionFactory();
			Connection conn = factory.getConnection();
			
			if ( conn != null ) {
				System.out.println( "Connection Successful!!!" );
				conn.close();
			}else {
				System.out.println( "Unable to get connection from factory..." );
			}
			
		} catch ( DataServiceException | SQLException e ) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectionDriver driver = new ConnectionDriver();
		driver.testConnection();
	}

}
