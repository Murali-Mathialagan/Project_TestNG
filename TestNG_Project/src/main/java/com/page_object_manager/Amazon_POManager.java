package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.pom.amazon.Amazon_SignIn;
import com.pom.amazon.Home_Page;
import com.pom.amazon.Online_Shopping_Site;

public class Amazon_POManager {

	public WebDriver driver;

	// Amazon

	private Home_Page home;

	private Amazon_SignIn sign_In;

	private Online_Shopping_Site site;

	public Amazon_POManager(WebDriver driver) {
		this.driver = driver;
	}

	public Online_Shopping_Site getSite() {
		if (site == null) {
			site = new Online_Shopping_Site(driver);
		}
		return site;
	}

	public Amazon_SignIn getSign_In() {
		if (sign_In == null) {
			sign_In = new Amazon_SignIn(driver);
		}
		return sign_In;
	}

	public Home_Page getHome() {
		if (home == null) {
			home = new Home_Page(driver);

		}
		return home;
	}

}
