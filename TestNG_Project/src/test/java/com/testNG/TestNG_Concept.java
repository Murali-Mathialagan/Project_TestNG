package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Concept {

	@BeforeTest
	public void browser() {
		System.out.println("launch browser");
	}

	@BeforeClass
	public void url() {
		System.out.println("launch url");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test
	public void women() {
		System.out.println("casual dress");
	}

	@Test
	public void mens() {
		System.out.println("casual dress");
	}

	@Test
	public void tShirt() {
		System.out.println("mens");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void methods() {
		System.out.println("Validate");
	}

}
