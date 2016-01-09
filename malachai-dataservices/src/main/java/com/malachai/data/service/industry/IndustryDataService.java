package com.malachai.data.service.industry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.malachai.data.service.ConnectionFactory;
import com.malachai.data.service.DataConnectionFactoryService;
import com.malachai.data.service.DataServiceException;
import com.malachai.value.domain.Industries;
import com.malachai.value.domain.IndustryType;

public class IndustryDataService {

	private static final String QUERY = "SELECT occupy_category.[occupy_id], occupy_category.[occupy_category] FROM occupy_category;";
	
	public IndustryDataService() {
	}
	
	public Industries getAllIndustries() {
		Industries industries = new Industries();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			DataConnectionFactoryService connectionService = DataConnectionFactoryService.getInstance();
			ConnectionFactory factory = connectionService.getConnectionFactory();
			conn = factory.getConnection();
			statement = conn.prepareStatement( QUERY );
			
			rs = statement.executeQuery();
			while ( rs.next() ) {
				IndustryType type = new IndustryType();
				type.setId( rs.getLong( 1 ) );
				type.setIndustryDescription( rs.getString( 2 ) );
				industries.getIndustries().add( type );
			}
			
			rs.close();
			statement.close();
			conn.close();
			
		} catch ( DataServiceException e ) {
			e.printStackTrace();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return industries;
	}
}
