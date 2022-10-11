package com.api_testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Validate_Json {

	@Test
	private void json_Validate() throws IOException, ParseException {

		File f = new File(
				"C:\\Users\\sblue\\eclipse-workspace\\TestNG_Project\\src\\test\\java\\com\\api_testing\\validate.json");
		FileReader reader = new FileReader(f);
		JSONParser jparser = new JSONParser();
		Object obj = jparser.parse(reader);
		JSONObject jsonObj = (JSONObject) obj;
		Object object = jsonObj.get("total");
		String value = object.toString();
		System.out.println(value);
	}

}
