package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TN_SameClass_Assignment {

	public WebDriver driver;

	@Test(dataProvider = "tutorialsNinjaLogin")
	public void loginSameClassDataProviderTN(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("#column-right > div > a:nth-child(13)"))).isDisplayed());

	}

	@DataProvider( name = "tutorialsNinjaLogin")
	public Object[][] tutorialsNinjaLoginInfo(){
		 Object[][] data = {{ "seleniumpanda@gmail.com","Selenium@123"},
				            {"seleniumpanda1@gmail.com","Selenium@123"},
				            {"seleniumpanda2@gmail.com","Selenium@123"}};
		 
		 
		 return data;
		 
		 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
		
		
		
	}
	
	
	


