package com.automation.Oct14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class How_To_Run_ATestCase_Even_If_Its_DependentOnAFailure {

public WebDriver driver;
	
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
		
		
	}
	
	@Test(priority = 1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Test(priority = 2, dependsOnMethods = "clickOnMyAccount" )// now this method depends on the one before it
	public void clickOnLogin() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

	}
	@Test(priority = 3, dependsOnMethods = {"clickOnMyAccount" , "clickOnLogin"})
	public void login() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	
	}
	
	@Test(priority = 4, dependsOnMethods = {"clickOnMyAccount" ,"clickOnLogin", "login"}, alwaysRun = true)// always run true means
	//that if a test case is dependent on a failure, instead of skipping it itll run it instead 
	public void logout() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
	
	
	

