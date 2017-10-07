package com.automationpractie.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePageFactory {

	static WebDriver driver;

	public HomePagePageFactory(WebDriver ldriver) {

		driver = ldriver;

	}

	
	@FindBy (xpath=".//*[@id='contact-link']/a")
	WebElement  contactus;
	
	@FindBy	(className="login")
	WebElement signin;
	
	public void navigateToSignIn() {
		
		signin.click();	
		
	}
		
	public  void navigateToContactUs() {
		
		contactus.click();
	}

}
