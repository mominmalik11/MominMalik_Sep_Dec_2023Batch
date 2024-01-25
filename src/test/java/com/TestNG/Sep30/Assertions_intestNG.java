package com.TestNG.Sep30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//There 2 types of Assertion techniques 
//1 at a webpage level - driver.getTitle, driver.getCurrentUrl, driver.getPageSource
//2 at a webElement level - isEnabled, isDisplayed, isSelected

public class Assertions_intestNG {

	// Assert(this is also called hard Assert)
	// Assert is a class which has a lot of methods athat can help us in Assertions or Validations
	// Assert.assertTrue() Assert.assertEquals( Assert.assertNotEquals Assert.fail
	// Soft Assert
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Login")).isDisplayed());
		

	}
	
	
	@Test (priority = 1)
	public void login() {
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	
	@Test(priority = 2, dependsOnMethods = "login")// code for test two depending on test 1
	public void logout() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@Test(priority = 3, dependsOnMethods = {"login", "logout"})// now this test is dependent on two tests
	public void goBackToHomePage() {
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
