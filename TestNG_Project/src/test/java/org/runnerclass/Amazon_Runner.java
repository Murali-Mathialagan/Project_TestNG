package org.runnerclass;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;

import com.page_object_manager.Amazon_POManager;

public class Amazon_Runner extends Utility_Files {
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	public static Amazon_POManager manager = new Amazon_POManager(driver);

	public static void main(String[] args) {
		run_Url("amazon");
		waits(10);
		
		
		
		

	}
}
