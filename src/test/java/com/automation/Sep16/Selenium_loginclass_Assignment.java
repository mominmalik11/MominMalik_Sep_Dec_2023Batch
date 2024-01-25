package com.automation.Sep16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_loginclass_Assignment {

	public static void main(String[] args) {
		tutorialsinninjaRegister();
		//WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		//driver.get("https://tutorialsninja.com/demo");
		//driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		// login button is a compound class value so cant use By.class name

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		// this is an absolute Xpath, NEVER USE THIS! this code will not adapt to future
		// updates at all

	}

	public static void tutorialsinninjaRegister() { //this will be using only dynamic Xpaths

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Momin");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Malik");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("Misformomin@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("2406456279");
		driver.findElement(By.xpath("//input[@name ='newsletter' and @value= '1' ]")).click();
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		

	}

}
