/**
 * 
 */
package com.malachai.value.domain;

import java.io.Serializable;

/**
 * @author Tom
 *
 */
public class AbstractRange implements Serializable {

	private static final long serialVersionUID = 6170749997105195810L;

	private int id_;
	private int low_;
	private int high_;
	
	public AbstractRange() {
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id_;
	}

	/**
	 * @param id the id to set
	 */
	public void setId( int id ) {
		this.id_ = id;
	}

	/**
	 * @return the low
	 */
	protected int getLow() {
		return low_;
	}

	/**
	 * @param low the low to set
	 */
	protected void setLow( int low ) {
		this.low_ = low;
	}

	/**
	 * @return the high
	 */
	protected int getHigh() {
		return high_;
	}

	/**
	 * @param high the high to set
	 */
	protected void setHigh( int high ) {
		this.high_ = high;
	}
}
