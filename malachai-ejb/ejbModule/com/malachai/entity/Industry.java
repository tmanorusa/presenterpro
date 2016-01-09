package com.malachai.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity( name="occupy_category" )
public class Industry implements Serializable {

	private static final long serialVersionUID = 1431067911393895568L;

	@Id
	@Column( name="occupy_id" )
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	
	@Column( name="occupy_category" )
	private String category;
	
	public Industry() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param id the id to set
	 */
	public void setId( Long id ) {
		this.id = id;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory( String category ) {
		this.category = category;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		if ( id != null ) {
			hash += id.hashCode();
		}
		return hash;
	}
	
	@Override
	public boolean equals( Object obj ) {
		boolean result = false;
		if (  obj instanceof Industry ) {
			Industry other = ( Industry ) obj;
			if ( ( this.id != null && other.id != null ) &&
				   ( this.id.equals( other.id ) ) ) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append( "Industry=[ " );
		sb.append( "id="+id.toString() );
		sb.append( ", category="+category.toString() );
		sb.append( " ]" );
		return sb.toString();
	}
}
