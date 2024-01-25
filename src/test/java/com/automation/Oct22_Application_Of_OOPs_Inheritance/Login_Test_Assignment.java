package com.automation.Oct22_Application_Of_OOPs_Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test_Assignment extends TestBase_Parent_Assignment {
	
	
	@BeforeMethod
	public void setup() {
		
		Login_Test_Assignment login_Test_Assignment = new Login_Test_Assignment();
		
		
		login_Test_Assignment.setupForLoginAndRegister();
		
		
	}
	
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
