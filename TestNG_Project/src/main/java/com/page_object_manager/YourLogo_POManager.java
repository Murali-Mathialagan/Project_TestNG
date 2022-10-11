package com.page_object_manager;

import org.openqa.selenium.WebDriver;
import org.pom.yourlogo.My_Account;
import org.pom.yourlogo.My_Store;
import org.pom.yourlogo.Order_Address;
import org.pom.yourlogo.Order_Payment;
import org.pom.yourlogo.Order_Shipping;
import org.pom.yourlogo.Order_Summary;
import org.pom.yourlogo.SignIn_Page;

public class YourLogo_POManager {
	
		public WebDriver driver;

		private My_Store store;

		private SignIn_Page signIn;

		private My_Account acc;

		private Order_Summary sum;

		private Order_Address adrs;

		private Order_Shipping ship;

		private Order_Payment pay;
		
		public YourLogo_POManager(WebDriver driver) {
			this.driver = driver;
		}
		
		public My_Store getStore() {
			if (store == null) {
				store = new My_Store(driver);
			}
			return store;
		}

		public SignIn_Page getSignIn() {
			if (signIn == null) {
				signIn = new SignIn_Page(driver);
			}
			return signIn;
		}

		public My_Account getAcc() {
			if (acc == null) {
				acc = new My_Account(driver);
			}
			return acc;
		}

		public Order_Summary getSum() {
			if (sum == null) {
				sum = new Order_Summary(driver);
			}
			return sum;
		}

		public Order_Address getAdrs() {
			if (adrs == null) {
				adrs = new Order_Address(driver);

			}
			return adrs;
		}

		public Order_Shipping getShip() {
			if (ship == null) {
				ship = new Order_Shipping(driver);
			}
			return ship;
		}

		public Order_Payment getPay() {
			if (pay == null) {
				pay = new Order_Payment(driver);

			}
			return pay;
		}

}
