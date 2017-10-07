package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName = "chrome";
		WebDriver driver = null;
		
		
		if (browserName.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "c:/lps/seleniumjars/geckodriver.exe");
			driver = new FirefoxDriver() ;
			
			
		}else if ( browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "c:/lps/seleniumjars/chromedriver.exe");
			 driver = new ChromeDriver() ;
			 				
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open the Website
    	driver.get("http://automationpractice.com/");
		
		WebElement signInLink = driver.findElement(By.cssSelector(".login"));	
		        	
        //Click on the sign in 
    	signInLink.click();
    	
    	WebElement emailAddress = driver.findElement(By.cssSelector("#email"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
       // WebElement signInButton = driver.findElement(By.id("SubmitLogin"));       
        
        
    	//Enter Credentials and sign in
    	emailAddress.sendKeys("trainee@lps.co.nz");
    	password.sendKeys("password01");
    	((JavascriptExecutor)driver).executeScript("document.getElementById('SubmitLogin').click();");
    	//signInButton.click();
    	
    	
    	System.out.println(driver.getTitle());    	
    	Asserts.check(driver.getTitle().equals("My account - My Store"), "The Title Does Not Match the Expected");
    	
        
	}

}
