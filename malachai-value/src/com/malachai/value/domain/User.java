/**
 * User.java
 */
package com.malachai.value.domain;

import java.io.Serializable;

/**
 * @author Tom
 *
 */
public abstract class User implements Serializable {

	private static final long serialVersionUID = -1622568093647535034L;

	private long id_;
	private String userName_;
	private String password_;
	private String firstName_;
	private String lastName_;
	private String userEmail_;
	private boolean isPresenter_ = false;
	private boolean isAttender_ = false;
	
	public User() {
	}

	/**
	 * @return the id_
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName_;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName( String userName ) {
		this.userName_ = userName;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password_;
	}
	
	/**
	 * @param password
	 */
	public void setPassword (String password ) {
		this.password_ = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName_;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName( String firstName ) {
		this.firstName_ = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName_;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName( String lastName ) {
		this.lastName_ = lastName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail_;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail( String userEmail ) {
		this.userEmail_ = userEmail;
	}

	/**
	 * @return the isPresenter
	 */
	public boolean isPresenter() {
		return isPresenter_;
	}

	/**
	 * @return the isAttender
	 */
	public boolean isAttender() {
		return isAttender_;
	}

	/**
	 * @param isAttender the isAttender to set
	 */
	protected void setAttender( boolean isAttender ) {
		this.isAttender_ = isAttender;
	}

	/**
	 * @param isPresenter the isPresenter to set
	 */
	protected void setPresenter( boolean isPresenter ) {
		this.isPresenter_ = isPresenter;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "User [ id=" );
		builder.append( getId() );
		builder.append( ", userName=" );
		builder.append( getUserName() );
		builder.append( ", firstName=" );
		builder.append( getFirstName() );
		builder.append( ", lastName=" );
		builder.append( getLastName() );
		builder.append( ", userEmail=" );
		builder.append( getUserEmail() );
		builder.append( ", isPresenter=" );
		builder.append( isPresenter() );
		builder.append( ", isAttender=" );
		builder.append( isAttender() );
		builder.append( " ]" );
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+( int ) ( id_ ^ ( id_ >>> 32 ) );
		result = prime*result+( ( userEmail_ == null ) ? 0 : userEmail_.hashCode() );
		result = prime*result+( ( userName_ == null ) ? 0 : userName_.hashCode() );
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj ) {
		if ( this == obj ) {
			return true;
		}
		if ( obj == null ) {
			return false;
		}
		if ( !( obj instanceof User ) ) {
			return false;
		}
		User other = ( User ) obj;
		if ( id_ != other.id_ ) {
			return false;
		}
		if ( userEmail_ == null ) {
			if ( other.userEmail_ != null ) {
				return false;
			}
		} else if ( !userEmail_.equals( other.userEmail_ ) ) {
			return false;
		}
		if ( userName_ == null ) {
			if ( other.userName_ != null ) {
				return false;
			}
		} else if ( !userName_.equals( other.userName_ ) ) {
			return false;
		}
		return true;
	}
}
