package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Shipping {
	public WebDriver driver;
	
	@FindBy(xpath = "//span/child::input[@id='cgv']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//span/parent::button[@type='submit' and @name='processCarrier']")
	private WebElement checkOut;

	public Order_Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

}
