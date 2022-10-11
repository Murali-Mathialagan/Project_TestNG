package com.features.testng;

import org.testng.annotations.Test;

public class Priority_Demo {

//	Default value for priority = 0 --> prints in ASCII based 

	@Test(priority = 1)
	public void hsc() {
		System.out.println("HSC");
	}

	@Test
	public void sslc() {
		System.out.println("sslc");
	}

	@Test(priority = 2)
	public void ug() {
		System.out.println("ug");
	}

	@Test(priority = 3)
	public void pg() {
		System.out.println("pg");
	}

	@Test
	private void course() {
		System.out.println("java");
	}

}
