/**
 * DataConnectionFactoryService.java
 */
package com.malachai.data.service;

import com.malachai.data.service.access.AccessUCanConnectionFactory;

/**
 * @author Tom
 *
 */
public class DataConnectionFactoryService {

	private static DataConnectionFactoryService service_ = null;
	private ConnectionFactory factory_;
	
	private DataConnectionFactoryService() {
	}
	
	public static synchronized DataConnectionFactoryService getInstance() {
		if ( service_ == null ) {
			service_ = new DataConnectionFactoryService();
		}
		return service_;
	}
	
	public ConnectionFactory getConnectionFactory() {
		if ( factory_ == null ) {
			factory_ = new AccessUCanConnectionFactory();
		}
		return factory_;
	}
}
