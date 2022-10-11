package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Files {

	public static WebDriver driver;
	public static String value;

	public static WebDriver get_Browser(String browser_Type) {
		if (browser_Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser_Type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void run_Url(String url) {
		if (url.equalsIgnoreCase("Adactin")) {
			driver.get("https://adactinhotelapp.com/");
		} else if (url.equalsIgnoreCase("yourlogo")) {
			driver.get("http://automationpractice.com/index.php");
		} else if (url.equalsIgnoreCase("facebook")) {
			driver.get("https://www.facebook.com/");
		} else if (url.equalsIgnoreCase("amazon")) {
			driver.get("https://www.amazon.in/");
		}
	}

	public static String get_Title() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static String get_Url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String get_Text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	public static void getTexts(List<WebElement> webElement) {
		for (WebElement data : webElement) {
			System.out.println(data.getText());
		}
	}

	public static String get_Tagname(WebElement element) {
		String tagName = element.getTagName();
		System.out.println(tagName);
		return tagName;
	}

	public static String get_Attribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
		return attribute;
	}

	public static Point get_Location(WebElement element) {
		Point location = element.getLocation();
		System.out.println(location);
		return location;
	}

	public static Dimension get_Size(WebElement element) {
		Dimension size = element.getSize();
		System.out.println(size);
		return size;
	}

	public static String get_CssValue(WebElement element, String name) {
		String cssValue = element.getCssValue(name);
		System.out.println(cssValue);
		return cssValue;
	}

	public static boolean displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public static void screen_Shot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void alerts(String name) {
		if (name.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (name.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static WebDriver frame_By_Element(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;
	}

	public static WebDriver frame_By_Index(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}

	public static WebDriver frame_By_name(String name) {
		WebDriver frame = driver.switchTo().frame(name);
		return frame;
	}

	public static void click_Actions(WebDriver driver, WebElement element) {

		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	public static void move_To_Element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void right_Click(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void double_Click_Element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public static void drag_And_Drop(WebDriver driver, WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static int select_By_Index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		return index;
	}

	public static String select_By_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
		return value;
	}

	public static String select_By_Text(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		return text;
	}

	public static boolean is_Multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static void get_Options(WebElement element, int index) {
		Select s = new Select(element);
		List<WebElement> all_Options = s.getOptions();
		for (int i = 0; i < all_Options.size(); i++) {
			WebElement options = all_Options.get(index);
			String text = options.getText();
			System.out.println(text);
		}
	}

	public static void get_SelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> SelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelectedOptions : SelectedOptions) {
			String text = allSelectedOptions.getText();
			System.out.println(text);
		}
	}

	public static void get_FirstOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public static Timeouts waits(int sec) {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		return implicitlyWait;
	}

	public static String particular_Cell_Data(String path, int sheet, int row, int cell) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i = (int) d;
			value = String.valueOf(i);
		}
		wb.close();
		return value;
	}

	public static String particular_Row_Data(String path,int sheet, int row) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				value = c.getStringCellValue();
			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int a = (int) d;
				value = String.valueOf(a);
			}
		}
		wb.close();
		return value;
	}

	public static String particular_Column_Data(String path, int sheet ,int cell) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(cell);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				value = c.getStringCellValue();
			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int a = (int) d;
				value = String.valueOf(a);
			}
		}
		wb.close();
		return value;
	}

	public static String all_Data(String path , int sheet) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);
				} else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int a = (int) d;
					String value = String.valueOf(a);
					System.out.println(value);

				}

			}
		}
		wb.close();
		return value;
	}
}
