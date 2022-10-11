package com.api_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Retrieve_Response {

	@Test
	private void ret_Res() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/unknown");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		
	}

}
