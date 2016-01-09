/**
 * 
 */
package com.malachai.value.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tom
 *
 */
public class Industries implements Serializable {

	private static final long serialVersionUID = -2474213305258759791L;

	private List< IndustryType > industries_;
	
	public Industries() {
		this.industries_ = new ArrayList< IndustryType >();
	}
	
	public List< IndustryType > getIndustries() {
		return industries_;
	}
}
