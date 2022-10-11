package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Melbourne {

	public WebDriver driver;

	@FindBy(xpath = "//select[@id='location']//child::option[@value='Melbourne']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']//child::option[@value='Hotel Creek']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']//child::option[.='Double']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']//child::option[.='4 - Four']")
	private WebElement roomNos;

	@FindBy(xpath = "//tr//descendant::input[@id='datepick_in']")
	private WebElement checkIn;

	@FindBy(xpath = "//td[@align='right']//following::input[@id='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "//select[@id='adult_room']//child::option[.='4 - Four']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']//child::option[.='4 - Four']")
	private WebElement childrenRoom;

	@FindBy(xpath = "//input[@id='Reset']//preceding-sibling::input")
	private WebElement search;

	@FindBy(xpath = "//td//child::input[@id='radiobutton_0']")
	private WebElement radioBtn;

	@FindBy(xpath = "//tr//descendant::input[@id='continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//span[@class='reg_error']//following::input[@id='first_name']")
	private WebElement fname;

	@FindBy(xpath = "//span[@class='reg_error']//following::input[@id='last_name']")
	private WebElement lname;

	@FindBy(xpath = "//label[@id='address_span']//preceding-sibling::textarea")
	private WebElement address;

	@FindBy(xpath = "//td//descendant::input[@id='cc_num']")
	private WebElement ccNo;

	@FindBy(xpath = "//select[@id='cc_type']//child::option[.='Master Card']")
	private WebElement ccType;

	@FindBy(xpath = "//select[@id='cc_exp_month']//child::option[.='December']")
	private WebElement expMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']//child::option[.='2017']")
	private WebElement expYear;

	@FindBy(xpath = "//td//child::input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='cc_cvv']//following::input[@id='book_now']")
	private WebElement bookNow;

	@FindBy(xpath = "//input//following-sibling::input[@id='my_itinerary']")
	private WebElement itinerary;

	@FindBy(xpath = "//table[@class='content']//following::input[@id='logout']")
	private WebElement logOut;

	@FindBy(xpath = "//td//child::a[.='Click here to login again']")
	private WebElement loginAgain;

	public Hotel_Melbourne(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLoginAgain() {
		return loginAgain;
	}
}
