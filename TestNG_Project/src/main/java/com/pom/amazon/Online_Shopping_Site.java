package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Online_Shopping_Site {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a//child::span[.='All']")
	private WebElement all;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search_Box;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement search_Btn;
	
	@FindBy(xpath = "//div//descendant::a[.='Best Sellers']")
	private WebElement bestSellers;
	
	@FindBy(xpath = "//div//child::a[.='Sell']")
	private WebElement sell;
	
	@FindBy(xpath = "//div//child::a[.='Gift Cards']")
	private WebElement gift_Cards;
	
	@FindBy(xpath = "//div//child::a[.='Kindle eBooks']")
	private WebElement kindle;
	
	@FindBy(xpath = "//div//child::a[.='Amazon Pay']")
	private WebElement amazon_Pay;
	
	@FindBy(xpath = "//a//child::span[.='Browsing History']")
	private WebElement browsing_History;
	
	@FindBy(xpath = "//div//child::a[.='Baby']")
	private WebElement baby;
	
	@FindBy(xpath = "//div//child::a[.='Gift Ideas	']")
	private WebElement gift_Ideas;
	
	@FindBy(xpath = "//div//child::a[.='Toys & Games']")
	private WebElement toys_Games;
	
	@FindBy(xpath = "//a//following-sibling::a[.='Health, Household & Personal Care']")
	private WebElement care;
	
	@FindBy(xpath = "//a[@id='nav-global-location-popover-link']")
	private WebElement location;
	
	@FindBy(xpath = "//span[@class='nav-line-2']//preceding::span[.='English']")
	private WebElement language;
	
	@FindBy(xpath = "//a//descendant::span[.='Hello, Murali']")
	private WebElement account_List;
	
	@FindBy(xpath = "//a//child::span[.='Returns']")
	private WebElement returns;
	
	@FindBy(xpath = "//a[@id='nav-cart']")
	private WebElement cart;
	

	public Online_Shopping_Site(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
