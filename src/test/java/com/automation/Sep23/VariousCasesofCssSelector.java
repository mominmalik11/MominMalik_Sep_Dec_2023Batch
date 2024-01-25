package com.automation.Sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousCasesofCssSelector {

	public static void main(String[] args) {
		rediffloginlogout();
	}
	
	public static void rediffloginlogout() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("herpderp");
		driver.findElement(By.cssSelector("input#password")).sendKeys("herpderp");
		
		
		
		
		
		
	}

}
