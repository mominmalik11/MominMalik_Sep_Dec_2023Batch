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

public class Understanding_ChromeOptions {
	
	public WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions(); //we are creating the Object of ChromeOptions Class
		// we can control the speed of our exectuation- faster, same speed, or slow it down
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);// this will speed up chrome
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);// this will slow down chrome
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);// this will keep it normal
		//options.addArguments("--headless");//this does all three options below in one line
		// this also doesnt open the browser app it just runs the program 
		options.addArguments("--start-maximized");// maximizes the browser so you dont need driver.manage().window().maximize()
		options.addArguments("--incognito");// open browser in incognito
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		//disables infobar up top on Chrome that shows its being automated
		driver = new ChromeDriver(options);//you have to enter in options to use the options listed above, if not itll open
		//Chrome regularly and ignore all the customized options up top
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@Test(priority =1)
	public void verifyLoginWithValidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		}
	
	@Test(priority =2)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
	@Test(priority =3)
	public void verifyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandaz@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


}
	@Test(priority =4)
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	
	@Test(priority =5)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
