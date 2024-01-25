package com.automation.Nov11_Keyboard_Actions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void keyBoardActions() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Actions action = new Actions(driver);

		WebElement firstname = 	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		action.click(firstname).sendKeys("Selenium").build().perform();
		action.sendKeys(Keys.TAB).build().perform();//this will allow you to use tab on keyboard to go to last name field in the registeration page 
		action.click(driver.findElement(By.id("input-lastname"))).sendKeys("Panda").build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		WebElement password = driver.findElement(By.id("input-password"));
		action.click(password).sendKeys("Selenium@123").build().perform();
		//what if we want to copy the password and paste it into the confirm password field?
		
		//CTRL A - select all
		action.keyDown(password, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//CTRL C
		action.keyDown(password, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		//CTRL V
		
		
		//keyDown
		//keyUp
		//sendKeys
		//copy paste
		//tab
		
		
		
		

		
		
		
	}

}
