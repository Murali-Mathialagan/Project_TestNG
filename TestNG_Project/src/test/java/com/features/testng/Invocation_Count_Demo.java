package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Invocation_Count_Demo extends Utility_Files {

	public static WebDriver driver;

	@Test
	private void chrome() {
		driver = get_Browser("chrome");
	}

	@Test(priority = 1)
	private void url() {
		run_Url("adactin");
	}

	@Test(priority = 2, invocationCount = 3)
	private void refresh() {
		driver.navigate().refresh();
	}

}
