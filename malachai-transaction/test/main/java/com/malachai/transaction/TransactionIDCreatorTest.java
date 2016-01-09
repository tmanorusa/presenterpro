package com.malachai.transaction;

import org.junit.Assert;
import org.junit.Test;

import com.malachai.transaction.TransactionIDCreator;

public class TransactionIDCreatorTest {

	@Test
	public void testCreateIdSingleCall() {
		Long tranIdExpected = new Long( 1l );
		
		TransactionIDCreator creator = TransactionIDCreator.getInstance();
		Long tranIdActual = creator.createId();
		System.out.println( "Expected: "+tranIdExpected );
		System.out.println( "Actual: "+tranIdActual.toString() );
		//Assert.assertEquals( tranIdExpected, tranIdActual );
	}
	
	public static void main(String[] args) {
		TransactionIDCreatorTest test = new TransactionIDCreatorTest();
		test.testCreateIdSingleCall();
	}
}
