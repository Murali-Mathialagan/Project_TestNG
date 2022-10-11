package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SignIn {
	public WebDriver driver;
	
	@FindBy(xpath = "//label//following-sibling::input[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath = "//span//preceding-sibling::input")
	private WebElement continue_Btn;
	
	@FindBy(xpath = "//div//child::input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath = "//div//descendant::input[@id='signInSubmit']")
	private WebElement sign_In_Btn;

	
	public Amazon_SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
