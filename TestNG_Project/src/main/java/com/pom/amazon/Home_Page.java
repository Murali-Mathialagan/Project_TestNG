package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;

	@FindBy(xpath = "//div//child::a[@id='nav-link-accountList']")
	private WebElement signIn;

	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//descendant::span[.='Sign in']")
	private WebElement signIn_Btn;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
