package org.junit;

public class Junit_Concept {

	@Before
	public void login() {
		System.out.println("Login");

	}

	@Test
	public void dress_Purchase() {
		System.out.println("Order Purchased");
	}
	
	@Test
	public void book_Purchase() {
		System.out.println("Book Purchased");
	}
	
	@Test
	public void phone_Purchase() {
		System.out.println("Phone Purchased");
	}

	@After
	public void logout() {
		System.out.println("Logout");
	}

}
