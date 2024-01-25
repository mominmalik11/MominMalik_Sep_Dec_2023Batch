package com.TestNG.Sep30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register_Using_Assertions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test (priority = 1)
	public void verifyRegisterMandatoryFields() {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Momin");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Malik");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Misformomin@gmail.com");
		driver.findElement(By.cssSelector("input-telephone")).sendKeys("2406415626");
		driver.findElement(By.cssSelector("input-password")).sendKeys("herderp");
		driver.findElement(By.cssSelector("input-confirm")).sendKeys("herpderp");
		//driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click();
		//not mandatory
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		}
	
	@Test(priority = 2)
	public void verifyRegisterWithAllFields() {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Momin");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Malik");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Misformomin@gmail.com");
		driver.findElement(By.cssSelector("input-telephone")).sendKeys("2406415626");
		driver.findElement(By.cssSelector("input-password")).sendKeys("herderp");
		driver.findElement(By.cssSelector("input-confirm")).sendKeys("herpderp");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click(); 
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 3)
	public void veriftyRegisterWithExistingEmail() {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Momin");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Malik");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda.com");
		driver.findElement(By.cssSelector("input-telephone")).sendKeys("2406415626");
		driver.findElement(By.cssSelector("input-password")).sendKeys("herderp");
		driver.findElement(By.cssSelector("input-confirm")).sendKeys("herpderp");
		//driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click(); 
		////Not mandatory field 
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 4)
	public void verifyRegisterWithNoDetails() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
