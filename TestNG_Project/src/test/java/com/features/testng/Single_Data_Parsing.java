package com.features.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Data_Parsing {
	
	@Parameters({"user","pass"})
	@Test
	public void username_Password(String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	
	
	
	

}
