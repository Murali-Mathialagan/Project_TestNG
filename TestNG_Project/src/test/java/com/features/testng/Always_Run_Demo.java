package com.features.testng;



import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page_object_manager.Adactin_POManager;

public class Always_Run_Demo extends Utility_Files{
	
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	
	
	@Test(priority=-2)
	private void url() {
		run_Url("adactin");
	}
	
	@Test(dependsOnMethods = "url")
	private void username() {
		send_Keys(manager.getLogin().getUserName(), "muralimariyan");
		System.out.println(10/0);
	}
	
	@Test(priority=-3,dependsOnMethods = "username",alwaysRun = true)
	private void password() {
		send_Keys(manager.getLogin().getPassword(), "Murali@25");
	}
	
	@Test
	private void login() {
		click(manager.getLogin().getLogIn());
	}
	
	
	
	
}