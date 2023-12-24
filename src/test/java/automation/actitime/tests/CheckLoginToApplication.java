package automation.actitime.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.actitime.pages.LoginPage;
import automation.actitime.utils.BaseTest;

public class CheckLoginToApplication extends BaseTest {
	
	LoginPage loginPage;

	@BeforeClass
	public void tsetup() {
		loginPage = new LoginPage(getDriver());

	}
	
	@Test (groups = {"smoke"})
		public void LoginToApplication() throws InterruptedException
	{   
		LoginPage.LoginORCreateAccount();
		Thread.sleep(5000);
		LoginPage.ClosePopup();
		LoginPage.EnterUN("mgadagkar1690@gmail.com");
		LoginPage.ClickOnContinue();
		Thread.sleep(1000);
		LoginPage.EnterPwd("Qwerty12345!");
		//LoginPage.HitLogin();
		LoginPage.Logout();
				
	}
	
	
}

