package com.automation.Oct22_Application_Of_OOPs_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Test {
	
	public WebDriver driver;
	
	@Test
	public void loginValidCredentials() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnMyAccountDropDown();
		//driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

		

		
		
		
		
		
		
	}
	
}
