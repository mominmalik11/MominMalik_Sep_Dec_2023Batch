package com.automation.Oct22_Application_Of_OOPs_Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationCode {
	
	
	@Test
	public void setup() {
		
		//WebDriver is an interface, and ChromeDriver() is the implementing class 
		//driver is the reference 
		// new ChromeDriver() is the object of implementing class
		
		//whenever we use() it represents methods
		
		
		WebDriver internet = new ChromeDriver();
		internet.manage().window().maximize();
		
		
		
		
	}

}
