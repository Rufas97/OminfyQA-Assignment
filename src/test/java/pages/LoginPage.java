package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class LoginPage extends BaseTest {

	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	public static Actions action;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@id='app']//li[2]/a")
	WebElement pimButton;
	
	public void username(String text)
	{
		username.sendKeys(text);
	}
	
	public void password(String text)
	{
		password.sendKeys(text);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	
	public void pimButtonMouseHover() {
		wait.until(ExpectedConditions.visibilityOf(pimButton));
		
	}
	public void pimButtonClick()
	{
		wait.until(ExpectedConditions.elementToBeClickable(pimButton));
		pimButton.click();
	}
	
	
}
