package com.automation.Sep17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths_practice {
	
	//Sometimes when you refresh the page the @id or @class will change, in this case you have to search for your xpath by
	//html[starts with (@id, '_______')] the part of the id that remains constant
	// or //html[ends with (@id ___'______')] if the numbers changing are in the front of the attribute 

	public static void main(String[] args) {
		TutorialNinjaDemoXpaths();
	}
	
	
	public static void XpathPractice() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
		//driver.findElement(By.xpath("//a[@title = 'Live commentary of the Indian stock markets, stock quotes and business news']")).click();
		//driver.findElement(By.xpath("//a[@title = 'Lightning fast business email hosting']")).click();
		driver.findElement(By.xpath("//a[@class ='vdicon']")).click();
		

	}
	
	public static void TutorialNinjaDemoXpaths() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@id = 'input-firstname']")).sendKeys("Momin");
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@id = 'input-lastname']")).sendKeys("Malik");
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@id = 'input-email']")).sendKeys("Misformomin@gmail.com");
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@id = 'input-telephone']")).sendKeys("2406456279");
		
	}

}
