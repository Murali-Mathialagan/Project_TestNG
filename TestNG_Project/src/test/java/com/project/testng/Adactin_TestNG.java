package com.project.testng;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.runnerclass.Adactin_Runner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page_object_manager.Adactin_POManager;
import com.singleton.Test_Data_Manager;

public class Adactin_TestNG extends Utility_Files {

	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	public static Logger log = Logger.getLogger(Adactin_Runner.class);
	public static Adactin_POManager manager = new Adactin_POManager(driver);

	@BeforeClass
	private void url_Launch() throws IOException {
		BasicConfigurator.configure();
		run_Url(Test_Data_Manager.get_Instance_Manager().get_Instance_Reader().get_Url());

		log.info("Adactin hotel Website Launched successfully");
		waits(10);
	}

	@BeforeMethod
	private void login() throws IOException {
		send_Keys(manager.getLogin().getUserName(),
				Test_Data_Manager.get_Instance_Manager().get_Instance_Reader().get_username());

		send_Keys(manager.getLogin().getPassword(),
				Test_Data_Manager.get_Instance_Manager().get_Instance_Reader().get_Password());
		click(manager.getLogin().getLogIn());

		log.info("Logged In succesfully");
	}

	@Test
	private void sunshine() throws IOException {
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
		log.info("Booked Hotel Successfully");

		click(manager.getSunshine().getRadioBtn());
		click(manager.getSunshine().getContinueBtn());

		send_Keys(manager.getSunshine().getFname(), "Murali");
		send_Keys(manager.getSunshine().getLname(), "Mathiyalagan");
		send_Keys(manager.getSunshine().getAddress(), "North America");
		send_Keys(manager.getSunshine().getCcNo(), "1234567891012345");
		click(manager.getSunshine().getCcType());
		click(manager.getSunshine().getExpMonth());
		click(manager.getSunshine().getExpYear());
		send_Keys(manager.getSunshine().getCvv(), "456");
		click(manager.getSunshine().getBookNow());
		log.info("Payment method and address completed successfully");

		click(manager.getSunshine().getItinerary());
		click(manager.getSunshine().getLogOut());
		click(manager.getSunshine().getLoginAgain());
		
	}

	@Test
	private void melbourne() {
		waits(10);

		click(manager.getMelbourne().getLocation());
		click(manager.getMelbourne().getHotels());
		click(manager.getMelbourne().getRoomType());
		click(manager.getMelbourne().getRoomNos());
		clear(manager.getMelbourne().getCheckIn());
		send_Keys(manager.getMelbourne().getCheckIn(), "16/09/2022");
		clear(manager.getMelbourne().getCheckOut());
		send_Keys(manager.getMelbourne().getCheckOut(), "20/09/2022");
		click(manager.getMelbourne().getAdultRoom());
		click(manager.getMelbourne().getChildrenRoom());
		click(manager.getMelbourne().getSearch());

		click(manager.getMelbourne().getRadioBtn());
		click(manager.getMelbourne().getContinueBtn());

		send_Keys(manager.getMelbourne().getFname(), "Murali");
		send_Keys(manager.getMelbourne().getLname(), "mathi");
		send_Keys(manager.getMelbourne().getAddress(), "canada");
		send_Keys(manager.getMelbourne().getCcNo(), "9876543210253674");
		click(manager.getMelbourne().getCcType());
		click(manager.getMelbourne().getExpMonth());
		click(manager.getMelbourne().getExpYear());
		send_Keys(manager.getMelbourne().getCvv(), "123");
		click(manager.getMelbourne().getBookNow());
		click(manager.getMelbourne().getLogOut());
		click(manager.getMelbourne().getLoginAgain());

	}

	@AfterMethod
	private void login_Again() {
		click(manager.getMelbourne().getLoginAgain());

	}

}
