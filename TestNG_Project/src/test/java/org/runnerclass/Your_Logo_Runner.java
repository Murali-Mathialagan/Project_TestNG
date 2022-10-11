package org.runnerclass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;

import com.page_object_manager.YourLogo_POManager;

public class Your_Logo_Runner extends Utility_Files {
	
	public static WebDriver driver = Utility_Files.get_Browser("chrome");

	public static Logger log = Logger.getLogger(Your_Logo_Runner.class);
	public static YourLogo_POManager manager = new YourLogo_POManager(driver);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		run_Url("yourlogo");
		log.info("Browser Launched");

		waits(10);

		click(manager.getStore().getSign_Btn());

		send_Keys(manager.getSignIn().getEmail(), "muralimariyan8@gmail.com");
		send_Keys(manager.getSignIn().getPassword(), "Abcd@123");
		click(manager.getSignIn().getSignIn());
		log.info("Signed In Successfully");

		move_To_Element(driver, manager.getAcc().getWomen());
		click(manager.getAcc().getCasualdress());
		click(manager.getAcc().getList());
		click(manager.getAcc().getMore());
		click(manager.getAcc().getQuantity());
		click(manager.getAcc().getSize());
		click(manager.getAcc().getAddToCart());
		click(manager.getAcc().getCheckOut());
		log.info("Product added to the cart successfully");
		
		get_Text(manager.getSum().getTotal());
		getTexts(manager.getSum().getTfootData());
		click(manager.getSum().getCheckOut());
		log.info("Total Amount printed");
		
		click(manager.getAdrs().getCheckOut());

		click(manager.getShip().getCheckBox());
		click(manager.getShip().getCheckOut());

		click(manager.getPay().getPayType());
		click(manager.getPay().getConfirmOrder());
		click(manager.getPay().getBack());
		log.info("Payment Confirmed"); 
		
	}

}
