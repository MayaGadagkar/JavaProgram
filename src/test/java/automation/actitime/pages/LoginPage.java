package automation.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//constructor
		WebDriver driver;
		/*public LoginPage(WebDriver driver)
		{
			super(driver);
		}*/
		
		//Locators
		@FindBy (xpath = "//div//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")
		private static WebElement LoginORCreateAccount;
		
		
		@FindBy (id= "username")
		private static WebElement _txtusername;
		
		@FindBy (xpath="//button[@class='capText font16']")
		private static WebElement _btncontinue;
		
		@FindBy (name= "password")
		private static WebElement _txtpassword;
		
		@FindBy (xpath= "//button[@type='submit']")
		private static WebElement _btnLogin;
		
		@FindBy (xpath= "//div//ul[@class='userSection pushRight']/li[4]")
		private static WebElement _myAccount;		
		
		@FindBy(id="logoutLink")
		private static WebElement _LogoutLink;
		
	   //Actions to the locators
		public static void LoginORCreateAccount()
		{
			LoginORCreateAccount.click();
		}
		
		public static void ClickOnContinue()
		{
			_btncontinue.click();
		}
		
		public static void EnterUN(String value)
		{
		_txtusername.sendKeys(value);
		}
		
		public static void EnterPwd(String value)
		{
			_txtpassword.sendKeys(value);
		}
		
		public static void ClickOnMyAccount()
		{
			_myAccount.click();
		}
		
		public HomePage HitLogin()
		{
			_btnLogin.click();
			return new HomePage(getDriver());
		}
	//this is for tutrialsninja
	    @FindBy (name= "search")
	    private static WebElement _txtSearch;

		@FindBy (xpath= "//*[@id='search']/span/button")
		private static WebElement _btnSearch;
		
		public static void ClearSearchText()
		{
			_txtSearch.clear();
		}
		
		public static void EnterSearchText(String value)
		{
			_txtSearch.sendKeys(value);
		}
		public static void ClickonSearchButton()
		{
			_btnSearch.click();
			
		}
		
		public static void Logout()
		{
			ClickOnMyAccount();
			
		}
		
		@FindBy (id= "second-img")
		private static WebElement _popup;
		
		@FindBy (id= "webklipper-publisher-widget-container-notification-close-div")
		private static WebElement _popupclose;
		
		public static void ClosePopup()
		{
			if(_popup.isDisplayed())
{
				_popupclose.click();
}
	}
		
		
		
	}

