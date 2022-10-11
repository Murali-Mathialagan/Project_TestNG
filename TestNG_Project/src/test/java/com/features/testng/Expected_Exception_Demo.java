package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Expected_Exception_Demo extends Utility_Files{
	
	public static WebDriver driver;
	
	@Test(expectedExceptions = NullPointerException.class)
	private void chrome_Driver() {
		driver = get_Browser("chrom");
	}
	
	
	
	
	

}
