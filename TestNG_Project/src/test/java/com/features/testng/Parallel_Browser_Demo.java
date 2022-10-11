package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Parallel_Browser_Demo {

	
	public static WebDriver driver;
	
	
	@Test
	private void yourlogo() {
		driver = Utility_Files.get_Browser("chrome");
		Utility_Files.run_Url("yourlogo");
	}
	
	
	@Test
	private void adactin() {
		driver = Utility_Files.get_Browser("chrome");
		Utility_Files.run_Url("Adactin");
	}
	
	
	
	
	
	
	
}
