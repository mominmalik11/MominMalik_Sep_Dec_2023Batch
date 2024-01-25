package com.java.Nov11_Waits_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Facebook_ImplicitWaits {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	
	
	@Test
	
	public void facebookDriverWaitTest() {
		
		//I want my  wait to be smart as well
		//thread.sleep is not smart it is rigid
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// without this you will not be able to type any info in the facebook dropdown registration

		driver.findElement(By.partialLinkText("Create new account")).click();
		//driver.findElement(By.linkText("Create new account")).click(); this can also work to find create new account find and click
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Selenium");//this explicit wait will work as well
		
		//driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		
		
	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
