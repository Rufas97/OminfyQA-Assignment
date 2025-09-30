package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PimPage;

public class ValidatePIMaddDetails extends BaseTest {


	@Test(priority=1,dataProvider = "getData")
	public void validatePIMaddDetails(String fname, String lname) throws InterruptedException {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.username("Admin");
		loginPage.password("admin123");
		loginPage.loginButton();
		Thread.sleep(3000);
		loginPage.pimButtonClick();
		Thread.sleep(3000);
		
		PimPage pimPage = PageFactory.initElements(driver, PimPage.class);
		pimPage.addEmployeeButton();
		pimPage.firstName(fname);
		Thread.sleep(2000);
		pimPage.lastName(lname);
		Thread.sleep(2000);
		pimPage.saveButtonClick();
		System.out.println("Employee Added: " + fname + " " + lname);
	}

	@DataProvider()
	public Object[][] getData() {
		return new Object[][] 
		{
			{ "John", "Doe" },
			{ "Alice", "Smith" },
			{ "Mark", "Brown" },
			{ "Emma", "Wilson" }
		};

	}

}
