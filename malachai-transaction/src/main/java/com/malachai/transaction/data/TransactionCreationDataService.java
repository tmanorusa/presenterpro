package com.malachai.transaction.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.malachai.data.service.ConnectionFactory;
import com.malachai.data.service.DataConnectionFactoryService;
import com.malachai.data.service.DataServiceException;

public class TransactionCreationDataService {
	
	private static final String CREATE_QUERY = "INSERT INTO trans_event (trans_event.[trans_cre_tsp]) VALUES (?);";
	private static final String DRAW_QUERY = "SELECT trans_event.[trans_id] FROM trans_event WHERE trans_event.[trans_cre_tsp]=?;";
	
	public TransactionCreationDataService() {
	}
	
	public List< Long > createNewIDs() {
		List< Long > list = new ArrayList< Long >();
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			DataConnectionFactoryService connectionService = DataConnectionFactoryService.getInstance();
			ConnectionFactory factory = connectionService.getConnectionFactory();
			conn = factory.getConnection();
			statement = conn.prepareStatement( CREATE_QUERY );
			Timestamp temp = new Timestamp( ( new Date() ).getTime() );
			statement.setTimestamp( 1, temp  );
			
			int result = statement.executeUpdate();
			if ( result >0 ) {
				conn.commit();
				System.out.println( "Insert pass/fail: "+result );
			}else {
				conn.rollback();
				System.out.println( "Insert failed, DB call rollback." );
			}
			statement.close();
			
			statement = conn.prepareStatement( DRAW_QUERY );
			statement.setTimestamp( 1,  temp );
			rs = statement.executeQuery();
			while ( rs.next() ) {
				list.add( rs.getLong( 1 ) );
			}
			
			rs.close();
			statement.close();
			conn.close();
			
		} catch ( DataServiceException e ) {
			e.printStackTrace();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return list;
	}
}
