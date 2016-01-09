/**
 * 
 */
package com.malachai.value.domain;

/**
 * @author Tom
 *
 */
public class AgeRange extends AbstractRange {

	private static final long serialVersionUID = 1205935223501601222L;

	public AgeRange() {
	}

	/**
	 * @return the lowAge
	 */
	public int getLowAge() {
		return super.getLow();
	}

	/**
	 * @param lowAge the lowAge to set
	 */
	public void setLowAge( int lowAge ) {
		super.setLow( lowAge );
	}

	/**
	 * @return the highAge
	 */
	public int getHighAge() {
		return super.getHigh();
	}

	/**
	 * @param highAge the highAge to set
	 */
	public void setHighAge( int highAge ) {
		super.setHigh( highAge );
	}
}
