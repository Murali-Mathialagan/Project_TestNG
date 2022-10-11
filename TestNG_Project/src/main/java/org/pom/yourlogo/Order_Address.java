package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Address {
	public WebDriver driver;

	public Order_Address(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button/child::span[.='Proceed to checkout']")
	private WebElement checkOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

}
