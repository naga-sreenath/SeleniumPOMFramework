package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.GmailLoginPage;
import com.qa.pages.HomePage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	GmailLoginPage loginpage;
    HomePage homePage;
    TestUtil testutil;

	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
    initialization();
     loginpage= new GmailLoginPage();
     homePage= loginpage.GmailLogin(prop.getProperty("username"), prop.getProperty("password"));
     Thread.sleep(5000);
    
}
	
	@Test
	
		public void addproducts() throws InterruptedException
		{
			homePage.addproducts(prop.getProperty("productname"), prop.getProperty("productcategory"), prop.getProperty("originalprice"), prop.getProperty("discountedprice"), prop.getProperty("productdescription"));
		}
	
	
	@AfterMethod()
	
	public void tearDown()
	{
		driver.quit();
	}
}
