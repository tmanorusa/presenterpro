/**
 * 
 */
package com.malachai.value.domain;

import java.io.Serializable;

/**
 * @author Tom
 *
 */
public class IndustryType implements Serializable {

	private static final long serialVersionUID = 7954198709582822350L;

	private long id_;
	private String industryDescription_;
	
	public IndustryType() {
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id_;
	}

	/**
	 * @param id the id to set
	 */
	public void setId( long id ) {
		this.id_ = id;
	}

	/**
	 * @return the industryDescription
	 */
	public String getIndustryDescription() {
		return industryDescription_;
	}

	/**
	 * @param industryDescription the industryDescription to set
	 */
	public void setIndustryDescription( String industryDescription ) {
		this.industryDescription_ = industryDescription;
	}
}
