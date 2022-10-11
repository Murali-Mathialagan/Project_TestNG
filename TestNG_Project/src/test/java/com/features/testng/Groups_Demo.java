package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page_object_manager.Adactin_POManager;

public class Groups_Demo extends Utility_Files{
	
	
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	
	@Test(priority = -1)
	private void url() {
		run_Url("adactin");
	}
	
	@Test(dependsOnMethods = "url",groups = "login")
	private void username() {
		send_Keys(manager.getLogin().getUserName(), "muralimariyan");
	}
	
	@Test(priority=-3,dependsOnMethods = "username",groups = "login")
	private void password() {
		send_Keys(manager.getLogin().getPassword(), "Murali@25");
	}
	
	@Test(priority = 1,groups="login")
	private void login() {
		click(manager.getLogin().getLogIn());
	}
	

}
