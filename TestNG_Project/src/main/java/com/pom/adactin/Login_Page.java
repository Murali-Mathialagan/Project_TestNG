package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	@FindBy(xpath = "//span[@id='username_span']//preceding-sibling::input")
	private WebElement userName;

	@FindBy(xpath = "//td//child::input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//tr//descendant::input[@id='login']")
	private WebElement logIn;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}
}
