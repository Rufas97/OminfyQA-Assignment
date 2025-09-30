package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class PimPage extends BaseTest {

	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement addEmployeeButton;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	
	public void addEmployeeButton()
	{
		addEmployeeButton.click();
	}
	public void firstName(String text)
	{
		firstName.sendKeys(text);

	}
	public void lastName(String text)
	{
		lastName.sendKeys(text);

	}
	public void saveButtonClick()
	{
		saveButton.click();
	}
	
}
