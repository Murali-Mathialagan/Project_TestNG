package com.api_testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\git\\Project_TestNG\\TestNG_Project\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> all_Tags = driver.findElements(By.tagName("a"));

		for (WebElement tags : all_Tags) {
			String link = tags.getAttribute("href");
			if (link == null || link.isEmpty()) {
				continue;
			}

			URL url = new URL(link);

			URLConnection openConnection = url.openConnection();

			HttpURLConnection httpConnection = (HttpURLConnection) openConnection;

			httpConnection.connect();

			int code = httpConnection.getResponseCode();

			String message = httpConnection.getResponseMessage();

			if (code >= 400) {
				System.out.println("Link: " + link + "---->Code: " + code + "----->message: " + message);
			}
			
			httpConnection.disconnect();

		}
	}

}
