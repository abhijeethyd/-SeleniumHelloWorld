package com.automationpractie.junittests;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.automationpractie.pages.HomePagePageFactory;

public class SignIn {
	
	private static WebDriver driver;
	
	@Before
	public void launchWebSite() {
		
		//System.setProperty("webdriver.gecko.driver", "c:/lps/seleniumjars/geckodriver.exe");
		//driver = new FirefoxDriver() ;
		
		System.setProperty("webdriver.chrome.driver", "c:/Trainings/chromedriver.exe");
		driver = new ChromeDriver() ;		
		driver.manage().timeouts().implicitlyWait(300 , TimeUnit.SECONDS);				 
		driver.get("http://automationpractice.com");

		
	}
	
	@Test
	public void validateLogin() throws InterruptedException {
		
		System.out.println("Executing Using linear method");	
		driver.findElement(By.className("login")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("trainee@lps.co.nz");
		driver.findElement(By.id("passwd")).sendKeys("password01");
		//driver.findElement(By.id("SubmitLogin")).click();
		((JavascriptExecutor)driver).executeScript("document.getElementById('SubmitLogin').click();");
		
		System.out.println(driver.getTitle());
		Asserts.check(driver.getTitle().contains("My account"), "Unable to Login");
		System.out.println("Executing Using linear method ENDS");
		
	}
	
	
	@Test
	public void validateNavigateToSignInPageFactory() throws InterruptedException {
		
		System.out.println("Executing Using PageFactory");
		HomePagePageFactory homePage = PageFactory.initElements(driver, HomePagePageFactory.class);		
		homePage.navigateToSignIn();

		
		System.out.println(driver.getTitle());
		Asserts.check(driver.getTitle().contains("Login"), "Unable to Login");
		
	}
	
	@After
	public void closeBrowser() {	
		
		driver.quit();
	}
	

	
	

}
