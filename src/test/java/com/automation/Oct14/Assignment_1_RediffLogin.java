package com.automation.Oct14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_1_RediffLogin {
	
	//valid credentials
	//Wrongusername Rightpassword
	//Right username wrong password
	//both username/password invalid
	//no credentials 
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a.signin")).click();
		
	}
	
	@Test(priority=1)
	public void loginValidInfo() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualWarning = driver.findElement(By.cssSelector("a.rd_logout")).getText();// CRTL SHIFT O
		String expectedWarning = "Wrong username and password combination.\r\n";
		Assert.assertEquals(actualWarning, expectedWarning);
	
	
	}
	
	
	@Test(priority=2)
	public void invalidUsernameValidPassword() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		WebElement invalidUsername= driver.findElement(By.linkText("Wrong username and password combination."));
		Assert.assertTrue(invalidUsername.isDisplayed());
		
	}
	
	@Test(priority=3)
	public void validUsernameInvalidPassword() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		WebElement invalidUsername= driver.findElement(By.linkText("Wrong username and password combination."));
		Assert.assertTrue(invalidUsername.isDisplayed());
		
		
		
		
	}
	
	@Test(priority=4)
	public void bothUsernameInvalid() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		WebElement invalidUsername= driver.findElement(By.linkText("Wrong username and password combination."));
		Assert.assertTrue(invalidUsername.isDisplayed());
	}
	@Test(priority=5)
	public void loginNoCredentials() {
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert alert = driver.switchTo().alert();//this tells the driver to focus on the alert 
		String actualAlertMessage= alert.getText();
		String expectedAlertMessage = "Please enter a valid user name";
		Assert.assertTrue(actualAlertMessage.contains(expectedAlertMessage));
		alert.dismiss();
		
		// alert is an interface not a class
		//Interview question what are 3 important methods inside Alert interface
		//1 .getText()
		//String messageOfAlert = alert.getText()
		//System.out.println(messageOfAlert);
		
		//2. accept();
		
		//3. dismiss();
		
		
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
