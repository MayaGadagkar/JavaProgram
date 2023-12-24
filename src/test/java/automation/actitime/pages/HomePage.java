package automation.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	//constructor
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	
	
	@FindBy (xpath ="//a[contains(@href,'genpact/tasks/tasklist.do')]")
	private static WebElement _TaskIcon;
	//Action to the locators
	public static void ClickonTask()
	{
		_TaskIcon.click();
	}
	
	
	
	
}
