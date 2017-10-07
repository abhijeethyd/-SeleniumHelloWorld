package com.automationpractie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	WebDriver driver;
	By emailinputbox = By.id("email");
	By password = By.id("passwd");
	By SubmitLogin = By.id("SubmitLogin");
			
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		
	}	
	
	public void Login(String userName , String userpassword ) {
		
		driver.findElement(emailinputbox).sendKeys(userName);
		driver.findElement(password).sendKeys(userpassword);
		driver.findElement(SubmitLogin).click();
		
	}
	

}
