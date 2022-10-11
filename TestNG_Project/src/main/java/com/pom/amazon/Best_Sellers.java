package com.pom.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Best_Sellers {
	
	@FindBy(xpath = "//div//child::a[.='Hot New Releases']")
	private WebElement new_Releases;
	
	@FindBy(xpath = "//h2[.='Hot New Releases in Electronics']//following::a[.='See More'][1]")
	private WebElement see_More;
	
	

}

