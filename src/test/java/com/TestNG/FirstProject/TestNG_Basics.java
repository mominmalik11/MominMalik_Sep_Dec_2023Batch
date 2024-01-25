package com.TestNG.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
	//declare WebDriver at a gobal level
	//@beforemethod write the code of opening NT
	//@Test login test
	//@test register test
	//@after method close the browser
	// use enabled = true
	
	public WebDriver driver; //declaring GLOBALLY the webdriver so you dont have to type it again and again 
	
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		}
	
	@Test (priority = 2, enabled = true)
	public void RegisterOption() {
		driver.findElement(By.linkText("Register"));
		
	}
	
	@Test (priority = 1)
	public void LoginOption() {
		driver.findElement(By.linkText("Login"));
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	

}
