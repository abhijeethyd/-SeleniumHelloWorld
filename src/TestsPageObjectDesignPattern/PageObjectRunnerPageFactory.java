package TestsPageObjectDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



import com.automationpractie.pages.HomePagePageFactory;

public class PageObjectRunnerPageFactory {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "c:/lps/seleniumjars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		driver.get("http://automationpractice.com");
		
		//HomePagePageFactory homePage = PageFactory.initElements(driver, HomePagePageFactory.class);
		
		HomePagePageFactory homePage = new HomePagePageFactory(driver);		
		PageFactory.initElements(driver, homePage);
		
		homePage.navigateToContactUs();

	}

}
