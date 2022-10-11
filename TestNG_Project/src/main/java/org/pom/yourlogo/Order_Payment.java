package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Payment {
	public WebDriver driver;

	@FindBy(xpath = "//p/child::a[@title='Pay by check.']")
	private WebElement payType;

	@FindBy(xpath = "//i//parent::a[.='Back to orders']")
	private WebElement back;

	public Order_Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBack() {
		return back;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPayType() {
		return payType;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	@FindBy(xpath = "//button/child::span[.='I confirm my order']")
	private WebElement confirmOrder;

}
