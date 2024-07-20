package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.GmailLoginPage;
import com.qa.pages.HomePage;

public class LoginPageTest extends TestBase{
	GmailLoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
    initialization();
     loginpage= new GmailLoginPage();
    
}
	
	@Test
	public void Gmaillogintest() throws InterruptedException
	{
		homePage=loginpage.GmailLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod()
	
			public void tearDown()
			{
				driver.quit();
			}
	
}