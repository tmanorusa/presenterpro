package com.malachai.transaction;

import java.util.Date;

import com.malachai.transaction.TransactionIDCreator;

public class ClientRequestThread implements Runnable {

	private Date start_;
	private Date end_;
	
	public ClientRequestThread() {
	}
	
	@Override
	public void run() {
		TransactionIDCreator creator = TransactionIDCreator.getInstance();
		start_ = new Date();
		Long tranId = creator.createId();
		end_ = new Date();
		System.out.println( tranId.toString()+" "+( end_.getTime()-start_.getTime() )+" ms" );
	}
}
