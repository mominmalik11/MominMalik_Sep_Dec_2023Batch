package com.automation.Oct8_TestNG_Repeat;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.Sep_30_Day9_SpecialClasses.Util;

public class Class_Assigment_2 {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void initializeBrowser() {
		options = new ChromeOptions(); //we are creating the Object of ChromeOptions Class
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);// this will speed up chrome
		options.addArguments("--start-maximized");// maximizes the browser so you dont need driver.manage().window().maximize()
		options.addArguments("--incognito");// open browser in incognito
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);//you have to enter in options to use the options listed above, if not itll open
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority = 1)
	public void verifyRegisterWithMandatoryDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("panda");
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("herpderp89");
		driver.findElement(By.id("input-confirm")).sendKeys("herpderp89");
		driver.findElement(By.name("agree")).click();
}
	@Test(priority = 2)
	public void verifyRegisterWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("panda");
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("herpderp89");
		driver.findElement(By.id("input-confirm")).sendKeys("herpderp89");
		driver.findElement(By.xpath("//input[@name= 'newsletter' and @value = '1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
		}
	
	@Test(priority = 3)
	public void verifyLoginWithNoDetails() {
		
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	

}
