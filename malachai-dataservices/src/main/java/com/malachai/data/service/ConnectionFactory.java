/**
 * ConnectionFactory.java
 */
package com.malachai.data.service;

import java.sql.Connection;

/**
 * @author Tom
 *
 */
public interface ConnectionFactory {

	public Connection getConnection() throws DataServiceException;
}
