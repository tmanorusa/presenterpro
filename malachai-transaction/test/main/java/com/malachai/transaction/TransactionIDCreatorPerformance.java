package com.malachai.transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionIDCreatorPerformance {

	public TransactionIDCreatorPerformance() {
	}
	
	public void testMultiThreadCall() {
		System.out.println( "Creating 1000 threads..." );
		List< Thread > threads = new ArrayList< Thread >();
		for ( int i=0; i<3000; i++ ) {
			threads.add( new Thread( new ClientRequestThread() ) );
		}
		
		System.out.println( "Executing threads..." );
		Date start = new Date();
		for ( Thread t : threads ) {
			t.start();
		}
		Date end = new Date();
		long elapsed = end.getTime()-start.getTime();
		System.out.println( "Start: "+start.toString() );
		System.out.println( "End: "+end.toString() );
		System.out.println( "Elapsed: "+elapsed+" ms" );
	}

	public static void main(String[] args) {
		TransactionIDCreatorPerformance test = new TransactionIDCreatorPerformance();
		test.testMultiThreadCall();
	}
}
