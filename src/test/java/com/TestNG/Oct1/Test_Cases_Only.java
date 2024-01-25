package com.TestNG.Oct1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_Cases_Only {
	public WebDriver driver;
	
	// to get the dataProvider to connect to @DataProvider in another class you have to add another parameter
	
	
	
	@Test(priority = 1, dataProvider = "TN", dataProviderClass = DataProviders_Only.class)// this allows the dataProvider to connect to 
	// a @DataProvider from another class entirely
	public void loginTN(String email, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);//with the string on top you can just type in email
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());// dont forget .display at the end
		
		
	}
	
	@Test(priority = 2, dataProvider = "Rediff", dataProviderClass = DataProviders_Only.class)
	public void loginReddif(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown () {
		driver.quit();
	}

}
