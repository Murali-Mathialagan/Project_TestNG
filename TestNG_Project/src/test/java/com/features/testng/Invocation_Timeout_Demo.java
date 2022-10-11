package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Invocation_Timeout_Demo extends Utility_Files{
	
	public static WebDriver driver;
	
	@Test
	private void chrome() {
		
		driver = get_Browser("chrome");
		}
	
	@Test(invocationTimeOut = 10000)
	private void url() {
		run_Url("amazon");
	}
}
