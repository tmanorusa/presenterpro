/**
 * 
 */
package com.malachai.data.service.user;

import com.malachai.value.domain.User;
import com.malachai.value.domain.Users;

/**
 * @author Tom
 *
 */
public class UserDataServiceTest {

	public UserDataServiceTest() {
	}
	
	public void testGetUsers() {
		UserDataService service = new UserDataService();
		Users users = service.getAllUsers();
		for ( User user : users.getUsers() ) {
			System.out.println( "User: "+user.getId()+") "+user.getUserName() );
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDataServiceTest test = new UserDataServiceTest();
		test.testGetUsers();
	}

}
