/**
 * 
 */
package com.malachai.data.service.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.malachai.data.service.ConnectionFactory;
import com.malachai.data.service.DataConnectionFactoryService;
import com.malachai.data.service.DataServiceException;
import com.malachai.value.domain.Attendee;
import com.malachai.value.domain.Presenter;
import com.malachai.value.domain.User;
import com.malachai.value.domain.Users;

/**
 * @author Tom
 *
 */
public class UserDataService {

	private static final String QUERY = "SELECT user.[user_id], user.[user_name], user.[user_pass], user.[first_nm], user.[last_nm], user.[user_email], "+
			"user.[presenter_user], user.[attender_user] FROM [user];";
	
	public UserDataService() {
	}
	
	public Users getAllUsers() {
		Users users = new Users();
		
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
				boolean presenter = rs.getBoolean( 7 );
				boolean attendee = rs.getBoolean( 8 );
				User user = null;
				
				if ( presenter ) {
					user = new Presenter();
				}else if ( attendee ) {
					user = new Attendee();
				}
				user.setId( rs.getLong( 1 ) );
				user.setUserName( rs.getString( 2 ) );
				user.setPassword( rs.getString( 3 ) );
				user.setFirstName( rs.getString( 4 ) );
				user.setLastName( rs.getString( 5 ) );
				user.setUserEmail( rs.getString( 6 ) );
				
				users.getUsers().add( user );
			}
			
			rs.close();
			statement.close();
			conn.close();
			
		} catch ( DataServiceException e ) {
			e.printStackTrace();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return users;
	}
}
