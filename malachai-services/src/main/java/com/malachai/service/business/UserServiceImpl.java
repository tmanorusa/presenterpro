/**
 * UserServiceImpl.java
 */
package com.malachai.service.business;

/**
 * @author Tom
 *
 */
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
	}
	
	@Override
	public void callUser( String msg ) {
		System.out.println( "In UserServiceImpl, Hello World! msg="+msg );
	}
}
