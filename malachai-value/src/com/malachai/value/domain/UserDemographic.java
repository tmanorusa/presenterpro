/**
 * UserDemographic.java
 */
package com.malachai.value.domain;

import java.io.Serializable;

/**
 * @author Tom
 *
 */
public class UserDemographic implements Serializable {

	private static final long serialVersionUID = -6901335316587594808L;

	private long id_;
	private String city_;
	private String state_;
	private String country_;
	private GenderType gender_;
	private AgeRange ageRange_;
	private SalaryRange salaryRange_;
	private String occupation_;
	private IndustryType industry_;
	
	public UserDemographic() {
	}

	/**
	 * @return the id
	 */
	public long getId_() {
		return id_;
	}

	/**
	 * @param id the id to set
	 */
	public void setId( long id ) {
		this.id_ = id;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city_;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity( String city ) {
		this.city_ = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state_;
	}

	/**
	 * @param state the state to set
	 */
	public void setState( String state ) {
		this.state_ = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country_;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry( String country ) {
		this.country_ = country;
	}

	/**
	 * @return the gender
	 */
	public GenderType getGender() {
		return gender_;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender( GenderType gender ) {
		this.gender_ = gender;
	}

	/**
	 * @return the ageRange
	 */
	public AgeRange getAgeRange() {
		return ageRange_;
	}

	/**
	 * @param ageRange_ the ageRange to set
	 */
	public void setAgeRange( AgeRange ageRange ) {
		this.ageRange_ = ageRange;
	}

	/**
	 * @return the salaryRange
	 */
	public SalaryRange getSalaryRange() {
		return salaryRange_;
	}

	/**
	 * @param salaryRange_ the salaryRange to set
	 */
	public void setSalaryRange( SalaryRange salaryRange ) {
		this.salaryRange_ = salaryRange;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation_;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation( String occupation ) {
		this.occupation_ = occupation;
	}

	/**
	 * @return the industry
	 */
	public IndustryType getIndustry() {
		return industry_;
	}

	/**
	 * @param industry the industry to set
	 */
	public void setIndustry( IndustryType industry ) {
		this.industry_ = industry;
	}
}
