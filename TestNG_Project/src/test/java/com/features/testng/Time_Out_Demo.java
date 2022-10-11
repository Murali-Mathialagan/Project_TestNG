package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Time_Out_Demo {
	
	
	public static WebDriver driver;
	
	@Test
	private void browser() {
		driver = Utility_Files.get_Browser("chrome");
	}
	
	@Test(timeOut = 1000)
	private void url() {
		Utility_Files.run_Url("amazon");
	}
	

}
