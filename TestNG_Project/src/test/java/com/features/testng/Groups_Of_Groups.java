package com.features.testng;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page_object_manager.Adactin_POManager;

public class Groups_Of_Groups extends Utility_Files{
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	
	@Test()
	private void a_url() {
		run_Url("adactin");
	}
	
	@Test(dependsOnMethods = "a_url",groups = "login")
	private void b_username() {
		send_Keys(manager.getLogin().getUserName(), "muralimariyan");
	}
	
	@Test(priority = -2,groups = "login")
	private void c_password() {
		send_Keys(manager.getLogin().getPassword(), "Murali@25");
	}
	
	@Test(groups="login")
	private void d_login() {
		click(manager.getLogin().getLogIn());
	}
	
	@Test(groups = "details")
	private void e_booking_Details() {
		waits(10);
		click(manager.getSunshine().getLocation());
		click(manager.getSunshine().getHotels());
		click(manager.getSunshine().getRoomType());
		click(manager.getSunshine().getRoomNos());
		clear(manager.getSunshine().getCheckIn());
		send_Keys(manager.getSunshine().getCheckIn(), "10/09/2022");
		clear(manager.getSunshine().getCheckOut());
		send_Keys(manager.getSunshine().getCheckOut(), "15/09/2022");
		click(manager.getSunshine().getAdultRoom());
		click(manager.getSunshine().getChildrenRoom());
		click(manager.getSunshine().getSearch());
	}
	
	@Test(groups="details")
	private void f_select_Hotel() {
		click(manager.getSunshine().getRadioBtn());
		click(manager.getSunshine().getContinueBtn());
	}
	
	@Test(groups = "details")
	private void g_customer_Details() {
		send_Keys(manager.getSunshine().getFname(), "Murali");
		send_Keys(manager.getSunshine().getLname(), "Mathiyalagan");
		send_Keys(manager.getSunshine().getAddress(), "North America");
	}
	
	@Test(dependsOnMethods = "a_url")
	private void h_payment_Details() {
		send_Keys(manager.getSunshine().getCcNo(), "1234567891012345");
		click(manager.getSunshine().getCcType());
		click(manager.getSunshine().getExpMonth());
		click(manager.getSunshine().getExpYear());
		send_Keys(manager.getSunshine().getCvv(), "456");
		click(manager.getSunshine().getBookNow());
	}

}
