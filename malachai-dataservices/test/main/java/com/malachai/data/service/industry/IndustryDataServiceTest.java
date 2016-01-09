package com.malachai.data.service.industry;

import com.malachai.value.domain.Industries;
import com.malachai.value.domain.IndustryType;

public class IndustryDataServiceTest {

	public IndustryDataServiceTest() {
		
	}
	
	public void testGetIndustries() {
		IndustryDataService service = new IndustryDataService();
		Industries industries = service.getAllIndustries();
		for ( IndustryType type : industries.getIndustries() ) {
			System.out.println( "Industry: "+type.getId()+") "+type.getIndustryDescription() );
		}
	}
	
	public static void main(String[] args) {
		IndustryDataServiceTest test = new IndustryDataServiceTest();
		test.testGetIndustries();
	}

}
