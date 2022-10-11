package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page_object_manager.Adactin_POManager;
import com.retry_Analyser.base.Retry_Utility;

public class Retry_Analyser_Demo extends Utility_Files{
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	Adactin_POManager manager = new Adactin_POManager(driver);
	
	@Test(retryAnalyzer = Retry_Utility.class)
	private void url() {
		run_Url("adactin");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
