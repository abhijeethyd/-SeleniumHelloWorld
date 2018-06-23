package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		String browserName = "chrome";
		WebDriver driver = null;
		
		
		if (browserName.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "c:/lps/seleniumjars/geckodriver.exe");
			driver = new FirefoxDriver() ;
			 	
			
		}else if ( browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "c:/Trainings/chromedriver.exe");
			 driver = new ChromeDriver() ;
				
		}	
		 
			 
	
		driver.manage().timeouts().implicitlyWait(300 , TimeUnit.SECONDS);
				 
		 driver.get("http://automationpractice.com");
//
//		 WebElement searchBox = driver.findElement(By.cssSelector("input[id$='p']"));
//		 //ID
//		 searchBox.sendKeys("Dress");
//
//		 WebElement newsLetterInputBox = driver.findElement(By.xpath("//input[starts-with(@id,'s')]/following::input[1]"));
//		 
//		 newsLetterInputBox.sendKeys("abhijeet");
//		 
//		
//		// driver.findElement(By.name("search_query")).sendKeys("Hi");		 
//		 driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
//		 
//		 		 
		//CSS Selector	 
		driver.findElement(By.cssSelector(".login")).click();		 
		 driver.findElement(By.id("email")).sendKeys("trainee@lps.co.nz");
		 driver.findElement(By.id("passwd")).sendKeys("password01");
		 driver.findElement(By.id("SubmitLogin")).click();
//		 
//		 //((JavascriptExecutor)driver).executeScript("document.getElementById('SubmitLogin').click();");
//		 		 
//		// Asserts.check(driver.getTitle().contains("My account"), "Unable to Login");
//		 
//		
//		
//		//XPath
//		 
//		 
//		// driver.findElement(By.xpath("//button[@name='submit_search']")).click();	
//		 
//		// driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Hello");
//			 
//		// driver.findElement(By.);
//		// Thread.sleep(15000);
//		// driver.close();
		 
	
		 
		 

	}

}
