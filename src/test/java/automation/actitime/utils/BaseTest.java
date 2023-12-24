package automation.actitime.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
		@BeforeSuite
	public void DriverSetUp() {
		WebDriverManager.chromedriver().driverVersion("116.0.5845.96").setup();
		driver = new ChromeDriver();
			}
		
		/*@BeforeTest
		public void LaunchURL()
		{
			driver.get("http://www.tutorialsninja.com/demo/");
			driver.manage().window().maximize();
		}*/
		
		@BeforeTest
    public void LaunchURL()
	   {
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
		}
		
		
		
	@AfterSuite
	public void TearDown()
	{
		//driver.quit();
		//driver.close();
	}
	
	
}
