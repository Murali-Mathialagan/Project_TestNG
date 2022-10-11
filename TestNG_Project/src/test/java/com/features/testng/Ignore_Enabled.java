package com.features.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Enabled {

	@Test
	private void facebook() {
		System.out.println("facbook");
	}

	@Test
	private void whatsapp() {
		System.out.println("whatsapp");
	}

	@Ignore
	@Test
	private void reddict() {
		System.out.println("reddict");
	}

	@Test(enabled = false)
	private void books() {
		System.out.println("books");
	}

}
