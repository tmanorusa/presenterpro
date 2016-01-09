/**
 * 
 */
package com.malachai.value.domain;

/**
 * @author Tom
 *
 */
public class Attendee extends User {

	private static final long serialVersionUID = 7798924193833339251L;

	public Attendee() {
		super();
		super.setAttender( true );
	}
}
