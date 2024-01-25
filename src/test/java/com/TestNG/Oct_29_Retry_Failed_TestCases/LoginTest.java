package com.TestNG.Oct_29_Retry_Failed_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;
	
	@Test(retryAnalyzer = My_Retry.class)
	public void loginValidation() {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("#input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2)")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		Assert.assertTrue((driver.findElement(By.linkText("Logout")).isDisplayed()));
		Assert.fail("Deliberately faling to show students how to retry test case in TestNG");
		
		// as a fail sage you want to make sure that those test cases that failed in the first run, gets 2 or 3 more chances to run
		//internet issue
		// the particular webElement could not render properly
		//
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
