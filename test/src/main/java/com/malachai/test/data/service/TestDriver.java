package com.malachai.test.data.service;

public class TestDriver {

	public static void main(String[] args) {
		//AccessODBCConnectionFactory factory = new AccessODBCConnectionFactory();
		AccessUCanConnectionFactory factory = new AccessUCanConnectionFactory();
		factory.getConnection();

	}

}
