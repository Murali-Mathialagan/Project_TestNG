package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	public WebDriver driver;

	@FindBy(xpath = "//ul/preceding-sibling::a[.='Women']")
	private WebElement women;
	
	@FindBy(xpath = "//a[.='Casual Dresses']//preceding::a[.='Casual Dresses']")
	private WebElement casualdress;
	
	@FindBy(xpath = "//ul/following::i[@class='icon-th-list']")
	private WebElement list;
	
	@FindBy(xpath = "//a/child::span[.='More']")
	private WebElement more;
	
	@FindBy(xpath = "//i/following::i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath = "//option/following-sibling::option[.='M']")
	private WebElement size;
	
	@FindBy(xpath = "//button/child::span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//i/parent::span[normalize-space()='Proceed to checkout']")
	private WebElement checkOut;
	
	public My_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getList() {
		return list;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	
}
