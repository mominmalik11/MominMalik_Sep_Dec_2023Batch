package com.java.Oct10_OOPS_Pillar1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class ApplicationsOfMethodsinAutomation1 {

	
	
	
	
	@Test
	public void setup(WebDriver driver1, WebDriver driver2) {
		
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://rediff.com");
		
		driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://tutorialsninja.com/demo");
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		}
	
	
	

}
