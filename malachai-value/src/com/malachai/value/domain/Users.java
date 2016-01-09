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
public class Users implements Serializable {

	private static final long serialVersionUID = -2076555501361740583L;

	private List< User > users_;
	
	public Users() {
		users_ = new ArrayList< User >();
	}
	
	public List< User > getUsers() {
		return users_;
	}
}
