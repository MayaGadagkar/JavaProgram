package automation.actitime.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.actitime.pages.HomePage;
import automation.actitime.pages.LoginPage;
import automation.actitime.utils.BaseTest;

public class SearchFlight extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;

	@BeforeClass
	public void tsetup() {
		loginPage = new LoginPage(getDriver());

	}
	
	@Test (groups = {"Regression"})
	
	public void LoginToApplication()
	{
		LoginPage.EnterUN("mgadagkar1690@gmail.com");
		LoginPage.EnterPwd("Ridhu18!!");
		//homePage = LoginPage.HitLogin();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage.ClickonTask();
				
	}

	/*@Test
	public void VerifySearchOfItems() {
		HomePage.ClearSearchText();
		HomePage.EnterSearchText("iPhone");
		HomePage.ClickonSearchButton();

	}*/

}
