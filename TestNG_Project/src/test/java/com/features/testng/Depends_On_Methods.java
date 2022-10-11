package com.features.testng;

import org.testng.annotations.Test;

public class Depends_On_Methods {

	@Test
	private void sslc() {
		System.out.println("sslc");
	}

// we use dependsOnMethods and priority at same test it will consider only dependsOnMethods, 
//	it will surpass the priority

	@Test(priority = -1, dependsOnMethods = "sslc")
	private void hsc() {
		System.out.println("hsc");
	}

	@Test()
	private void ug() {
		System.out.println("ug");
	}

	@Test(priority = -2, dependsOnMethods = "ug")
	private void pg() {
		System.out.println("pg");
	}

	@Test(dependsOnMethods = "com.features.testng.Priority_Demo.course")
	private void tool() {
		System.out.println("selenium");
	}
}
