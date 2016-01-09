/**
 * 
 */
package com.malachai.value.domain;

/**
 * @author Tom
 *
 */
public class SalaryRange extends AbstractRange {

	private static final long serialVersionUID = -3732202620726367947L;

	public SalaryRange() {
	}

	/**
	 * @return the lowSalary
	 */
	public int getLowSalary() {
		return super.getLow();
	}

	/**
	 * @param lowSalary the lowSalary to set
	 */
	public void setLowSalary( int lowSalary ) {
		super.setLow( lowSalary );
	}

	/**
	 * @return the highSalary
	 */
	public int getHighSalary() {
		return super.getHigh();
	}

	/**
	 * @param highSalary the highSalary to set
	 */
	public void setHighSalary( int highSalary ) {
		super.setHigh( highSalary );
	}
}
