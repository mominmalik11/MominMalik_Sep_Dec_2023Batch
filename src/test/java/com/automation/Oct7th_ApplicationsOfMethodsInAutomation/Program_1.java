package com.automation.Oct7th_ApplicationsOfMethodsInAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program_1 {

	public WebDriver driver;// this is an instance variable, essentially non static variables outside of any
							// method, constructor, or block
							// instance variables are seen by all methods in the class

	@Test
	public void intializeBrowserAndOpenApplication() { //if you make a parameter aka String browserName you have to use it below
		//if you dont use it the test will run nothing
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// this is a wati condition 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("https://tutorialsninja.com/demo");
		
		

	}

}
