package com.automation.Oct8_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeadlessMode_ChromeOptions {
	
	
	//means the browsers will not open in the Front End UI application
	//everything will happen in the backend 
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		
		options = new ChromeOptions(); //we are creating the Object of ChromeOptions Class
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);// this will speed up chrome
		options.addArguments("--headless");
		//options.addArguments("--start-maximized");// maximizes the browser so you dont need driver.manage().window().maximize()
		//options.addArguments("--incognito");// open browser in incognito
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);//you have to enter in options to use the options listed above, if not itll open
		driver.get("https://tutorialsninja.com/demo");
		
		
		
	}
	
	@Test(priority = 1)
	public void searchValidProduct() {
		driver.findElement(By.cssSelector("form-control.input-lg")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
		
		}
	@Test(priority = 2)
	public void verifySearchInvalidProduct() {
		driver.findElement(By.cssSelector("form-control.input-lg")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
		}
	
	@Test(priority = 3)
	public void verifySearchNoProduct() {
	
	
		
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}




