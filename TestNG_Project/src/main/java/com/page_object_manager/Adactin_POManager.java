package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Hotel_Melbourne;
import com.pom.adactin.Hotel_Sunshine;
import com.pom.adactin.Login_Page;


public class Adactin_POManager {

	public WebDriver driver;

	private Login_Page login;
	
	private Hotel_Sunshine sunshine;
	
	private Hotel_Melbourne melbourne;


	public Adactin_POManager(WebDriver driver) {
		this.driver = driver;
	}

	public Login_Page getLogin() {
		if (login == null) {
			login = new Login_Page(driver);
		}
		return login;
	}
	
	public Hotel_Melbourne getMelbourne() {
		if (melbourne == null) {
			melbourne = new Hotel_Melbourne(driver);
		}
		return melbourne;
	}

	public Hotel_Sunshine getSunshine() {
		if (sunshine == null) {
			sunshine = new Hotel_Sunshine(driver);
		}
		return sunshine;
	}

	

	

}
