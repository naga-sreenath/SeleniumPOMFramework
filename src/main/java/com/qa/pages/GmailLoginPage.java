package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class GmailLoginPage extends TestBase{
	
	@FindBy(xpath="//button[@class='pos-rel spinner-btn btn-outline-auth btn-google-login']")
	WebElement googlelogo;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement username;
	
	@FindBy(xpath="(//span[contains(text(),'Next')])")
	WebElement Next;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	// Initializing the page objects
	
	public GmailLoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	// Actions;
	public String validateGmailcredentials()
	{
		return driver.getTitle();
	}
	
	public HomePage GmailLogin(String un, String pwd) throws InterruptedException
		{
		googlelogo.click();
		// Switching to new pop up for Google login page
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		username.sendKeys(un);
		Thread.sleep(5000);
		Next.click();
		Thread.sleep(5000);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		Next.click();
		Thread.sleep(5000);

		for (String winHandle1 : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle1);
		}
		return new HomePage();
	}
}
