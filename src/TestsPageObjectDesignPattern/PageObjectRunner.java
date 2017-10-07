package TestsPageObjectDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automationpractie.pages.HomePage;
import com.automationpractie.pages.SignInPage;

public class PageObjectRunner {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "c:/lps/seleniumjars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("http://automationpractice.com");
		
		HomePage homePage = new HomePage(driver);		
		homePage.navigateToSignIn();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.Login("trainee@lps.co.nz", "password01");
		

	}

}
