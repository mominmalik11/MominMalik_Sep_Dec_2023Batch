package com.automation.Sep17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_validation {

	public static void main(String[] args) {
		
		LandingPage();
	}
	
	//Landing Page
	public static void LandingPage() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String expectedTitle= "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if(actualTitle.equals(expectedTitle)) {
System.out.println("they match");
		}else{
			System.out.println("they do not match");
		}
		
	}

}
