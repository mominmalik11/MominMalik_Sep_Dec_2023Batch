package com.automation.Oct22_Application_Of_OOPs_Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_Parent_Assignment {
	
	public WebDriver driver;
	
	public WebDriver setupForLoginAndRegister() {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		return driver;
		
	}
	
	
	

}
