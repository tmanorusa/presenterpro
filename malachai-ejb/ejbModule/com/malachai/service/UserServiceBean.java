package com.malachai.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

import com.malachai.service.business.UserServiceImpl;

/**
 * Session Bean implementation class UserServiceBean
 */
@Stateless(mappedName = "ejb/local/presenter/UserService")
public class UserServiceBean implements UserService {

    /**
     * Default constructor. 
     */
    public UserServiceBean() {
    }

	@Override
	public void callUser( String msg ) {
		com.malachai.service.business.UserService service = new UserServiceImpl();
		System.out.println( "In UserService EJB, calling business.UserService!" );
		service.callUser( msg );
	}

	@PostConstruct
	public void initialize() {
		System.out.println( "UserServiceBean initialized." );
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println( "UserServiceBean terminating." );
	}
}
