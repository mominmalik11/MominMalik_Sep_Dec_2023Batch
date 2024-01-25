package com.automation.Sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[value=Login]")).click();
		
		
		
		

		}

	}


