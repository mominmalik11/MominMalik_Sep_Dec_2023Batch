package com.TestNG.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Automation {
	
	public WebDriver driver;// you write this other wise every case you have to write the driver being assigned chrome
	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver(); //Ctrl Shift O
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		}
	
	@Test(priority = 2) // you can assign priorities also 
	public void selectLoginOption() {
		driver.findElement(By.linkText("Login"));
	}
	
	@Test(priority = 1, enabled=false)//and deactivate certain tests so you can test singular ones
	public void selectRegisterOption() {
		driver.findElement(By.linkText("Register"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
