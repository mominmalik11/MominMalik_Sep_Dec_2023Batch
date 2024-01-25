package com.automation.Oct15_TestNG_testing.xml;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Using_testNG_xmlFile {
	public WebDriver driver;
	public ChromeOptions options;
	
	
	// when youre parameterizing always execute code from the xml file not 
	@BeforeMethod
	public void loginSetup() {
		
		
		}
	
	@Test(priority = 1)
	@Parameters({"url", "email", "password"})// theses parameters are linked to the xml testNG suite
	public void verifyLoginWithValidCredentials(String url, String email, String password) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
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