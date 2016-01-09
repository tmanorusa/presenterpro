/**
 * 
 */
package com.malachai.value.domain;

/**
 * @author Tom
 *
 */
public enum GenderType {

	MALE( "M" ),
	FEMALE( "F" );
	
	@SuppressWarnings( "unused" )
	private String value_;
	
	private GenderType( String value ) {
		this.value_ = value;
	}
}
