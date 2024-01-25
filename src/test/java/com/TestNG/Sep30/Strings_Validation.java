package com.TestNG.Sep30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Strings_Validation {
	public WebDriver driver;
	
	@Test
	public void CheckingEqualsMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText(); // This is 
		// basically String S1 = something 
		String expectedEditAccountInfoLink = "Edit your account information";
		// string S2 = something
		
		System.out.println(actualEditAccountInfoLink.equals(expectedEditAccountInfoLink));
		//When using strings you use .equals method not == 
		driver.quit();
		}
	
	@Test
	public void TestChangeYourPassword() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualChangeyourPassword = driver.findElement(By.linkText("Change your password")).getText();
		String expectedChangeyourPassword= "Change your password";
		
		System.out.println(actualChangeyourPassword.equals(expectedChangeyourPassword));
		driver.quit();
		
	}
	
	@Test
	public void modifyAdressBook() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualModifyAddressBook = driver.findElement(By.linkText("Modify your address book entries")).getText();
		String expectedModifyAdressBook = "Modify your address book entries";
		
		System.out.println(actualModifyAddressBook.equals(expectedModifyAdressBook));
		driver.quit();
		
	}
	
	@Test
	public void modifyYourWishList() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualModifyWishList = driver.findElement(By.linkText("Modify your wish list")).getText();
		String expectedModifyWishList = "Modify your wish list";
		
		System.out.println(actualModifyWishList.equals(expectedModifyWishList));
		driver.quit();
			
	}
	
	
	@Test
	public void logoutVerify() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actuallogOut = driver.findElement(By.linkText("Logout")).getText();
		String expectedlogOut = "Logout";
		
		System.out.println(actuallogOut.equals(expectedlogOut));
		
		
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
		
		}
	
}
