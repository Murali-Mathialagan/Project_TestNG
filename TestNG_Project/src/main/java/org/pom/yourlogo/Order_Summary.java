package org.pom.yourlogo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {
	public WebDriver driver;

	public Order_Summary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//th/following-sibling::th[.='Total']")
	private WebElement total;

	@FindBy(xpath = "//table/tfoot/tr/td")
	private List<WebElement> tfootData;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTotal() {
		return total;
	}

	public List<WebElement> getTfootData() {
		return tfootData;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	@FindBy(xpath = "//p//descendant::span[.='Proceed to checkout']")
	private WebElement checkOut;
	

}
