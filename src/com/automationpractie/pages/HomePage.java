package com.automationpractie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// This class will store all the locator and methods of HomePage

public class HomePage {
	
	WebDriver driver;
	By signin = By.className("login");
	
	
	//Constructor to accept driver 
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public void navigateToSignIn() {
		
		driver.findElement(signin).click();	
		
	}
}
