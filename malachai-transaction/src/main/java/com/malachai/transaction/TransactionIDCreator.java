/**
 * TransactionIDCreator.java
 */
package com.malachai.transaction;

import java.util.ArrayList;
import java.util.List;

import com.malachai.transaction.data.TransactionCreationDataService;

/**
 * @author Tom
 *
 */
public class TransactionIDCreator {

	private static TransactionIDCreator creator_ = null;
	private List< Long > idList_;
	
	private TransactionIDCreator() {
		initializeCache();
	}
	
	public static synchronized TransactionIDCreator getInstance() {
		if ( creator_ == null ) {
			creator_ = new TransactionIDCreator();
		}
		return creator_;
	}
	
	public Long createId() {
		return idList_.remove( 0 );
	}
	
	private void initializeCache() {
		idList_ = new ArrayList< Long >();
		TransactionCreationDataService service = new TransactionCreationDataService();
		idList_.addAll( service.createNewIDs() );
		loadPriorCreatedIDs();
	}
	
	private void loadPriorCreatedIDs() {
		
	}
}
