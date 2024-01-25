package com.automation.Oct14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions_Assert {
	//Assert is always used in TestNg @Test
	
	@Test(enabled = false)
	public void explainAssertions() {
		//assertTrue(), assertFalse(), assertEquals(),assertNotEquals()
		Assert.assertTrue(1<2);//this condition is true so it will pass
		Assert.assertFalse(1<2);// this condition is also true and will pass
		Assert.assertTrue(1 == 1);
		
		
		Assert.assertEquals(false, true);// false, this will not pass since the two entities are not equal
		Assert.assertNotEquals(false, true);// true, this will pass 
		
		String s1 = " I am learning Java";
		String s2 = "I am learning Python";
		
		//compare these two Strings using Assertions
		
		Assert.assertEquals(s1, s2);// this will be false
		Assert.assertTrue(s1.equals(s2));//false
		Assert.assertTrue(!s1.equals(s2));// this is true;
		
		//WebElement mother = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
		//I want to determine the text which this mother WebElement holds (look below)
		//mother.getText();
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		
		Assert.fail();
		Assert.fail("Deliberately failing it");// when you want a test case to fail
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		// first you need 
		// to decide what you want to assert, you need to objectify the WebElement
		//then apply assertion
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
		
		
	}

	@Test(priority = 2)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("sssssseleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sssssselenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);// you can use either or assertions
	
	
	}
	
	
	@Test(priority = 3)
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Ssselenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);	
	
	}
	
	
	@Test(priority = 4)
	public void veriftyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("szcasdaeleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);	
	
		
	}
	@Test(priority = 5)
	public void verifyLoginWithNoCredentials() {
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
