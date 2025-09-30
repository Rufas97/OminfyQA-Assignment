package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidateLoginPage extends BaseTest{

	@Test
	public void validateLoginPage() throws InterruptedException
	{
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.username("Admin");
		loginPage.password("admin123");
		loginPage.loginButton();
		Thread.sleep(3000);
		loginPage.pimButtonClick();
		Thread.sleep(3000);
	}
}
