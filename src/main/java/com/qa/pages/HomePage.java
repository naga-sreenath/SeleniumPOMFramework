package com.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class HomePage extends TestBase{
	
	//Page Factory - OR :
	@FindBy(xpath="(//div[contains(text(),'Products')])")
	WebElement products;
	
	@FindBy(xpath="(//span[contains(text(),'Add new product')])")
	WebElement AddnewProduct;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement productname;
	
	@FindBy(xpath="//input[@name='categories']")
	WebElement productcategory;
	
	@FindBy(xpath="(//span[contains(text(),'Add new category')])")
	WebElement addnewcategory;
	
	@FindBy(xpath="//input[@name='category-name']")
	WebElement categoryname;
	
	@FindBy(xpath="(//span[contains(text(),'Create category')])")
	WebElement createcategory;
	
	@FindBy(xpath="//input[@name='original_price']")
	WebElement price;
	
	@FindBy(xpath="//input[@name='selling_price']")
	WebElement discountedprice;
	
	@FindBy(xpath="//input[@name='description']")
	WebElement productdescription;
	
	@FindBy(xpath="//div[@class='file-image-upload']")
	WebElement uploadproductimage;
	
	@FindBy(xpath="(//div[@class='suggested-image-container'])[2]")
	WebElement selectimage;
	
	@FindBy(xpath="(//span[contains(text(),'Done')])")
	WebElement done;
	
	@FindBy(xpath="(//span[contains(text(),'Add product')])")
	WebElement addproduct;
	
	@FindBy(xpath="//div[@class='mb8 cur-p c-white text-medium']")
	WebElement allproducts;
	
	@FindBy(xpath="//span[@class='MuiSwitch-thumb']")
	WebElement switchtomakeoutofstock;
	
	@FindBy(xpath="(//p[@class='action'])[2]")
	WebElement outofstock;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addproducts(String pdname, String pdcategory, String orprice, String disprice, String pddes) throws InterruptedException
	{
		String winHandleBefore = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			
			
		}
		products.click();
		Thread.sleep(10000);
		AddnewProduct.click();
		Thread.sleep(10000);
		productname.sendKeys(pdname);
		Thread.sleep(10000);
        productcategory.click();
		Thread.sleep(10000);
		driver.switchTo().activeElement();

        addnewcategory.click();
		Thread.sleep(10000);
        categoryname.sendKeys(pdcategory);
		Thread.sleep(10000);
		createcategory.click();
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE);
		actions.build().perform();
		Thread.sleep(5000);
        price.sendKeys(orprice);
		Thread.sleep(5000);
        discountedprice.sendKeys(disprice);
		Thread.sleep(5000);
        productdescription.sendKeys(pddes);
		Thread.sleep(5000);
		uploadproductimage.click();
		Thread.sleep(5000);
        selectimage.click();
		Thread.sleep(5000);
        done.click();
		Thread.sleep(5000);
        addproduct.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		products.click();
		Thread.sleep(5000);
		allproducts.click();
		Thread.sleep(5000);
		switchtomakeoutofstock.click();
		Thread.sleep(5000);
        outofstock.click();
        String outofstockmessage = driver.findElement(By.xpath("//div[@id='notistack-snackbar']")).getText();
		System.out.println("out of stock message is->" + outofstockmessage);
		assertEquals(outofstockmessage, "Product is set out of stock");
		Thread.sleep(5000);



	}

}
