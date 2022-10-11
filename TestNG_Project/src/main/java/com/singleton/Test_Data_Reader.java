package com.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {

	public static Properties p;

	public Test_Data_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\sblue\\eclipse-workspace\\Sep_Project_22\\src\\main\\java\\com\\singleton\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Url() throws IOException {

		String url = p.getProperty("url");
		return url;

	}

	public String get_username() throws IOException {
		String username = p.getProperty("Username");
		return username;

	}

	public String get_Password() throws IOException {
		String password = p.getProperty("password");
		return password;
	}

}
