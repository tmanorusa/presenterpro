package com.malachai.service.cache;

import java.util.HashMap;
import java.util.Map;

import com.malachai.value.domain.AgeRange;
import com.malachai.value.domain.SalaryRange;

public class Ranges {

	private static Ranges ranges_ = null;
	private Map< Integer, AgeRange > ageRanges_;
	private Map< Integer, SalaryRange > salaryRanges_;
	
	private Ranges() {
		this.ageRanges_ = new HashMap< Integer, AgeRange >();
		this.salaryRanges_ = new HashMap< Integer, SalaryRange >();
	}
	
	public static synchronized Ranges getRanges() {
		if ( ranges_ == null ) {
			ranges_ = new Ranges();
		}
		return ranges_;
	}
	
	public AgeRange getAgeRange( int ageId ) {
		AgeRange range = getAgeRanges().get( new Integer( ageId ) );
		return range;
	}
	
	public Map< Integer, AgeRange > getAgeRanges() {
		return this.ageRanges_;
	}
	
	public SalaryRange getSalaryRange( int salaryId ) {
		SalaryRange range = getSalaryRanges().get( new Integer( salaryId ) );
		return range;
	}
	
	public Map< Integer, SalaryRange > getSalaryRanges() {
		return this.salaryRanges_;
	}
}
