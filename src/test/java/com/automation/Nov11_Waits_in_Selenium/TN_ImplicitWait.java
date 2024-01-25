package com.automation.Nov11_Waits_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TN_ImplicitWait {
	
	
	public WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeMethod
	public void launchUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this is an unimplimented methods of the WebDriver interface
		//this is generally used for new apps that arent optimized. The application (collection of WebElements) - some WebElement might shows up a little late
		//since you used wait so early in the code you are basically saying the entire test might need to wait after every line is executed 
		//implicit wait is a smart form of wait, lets say the WebElement appears in .5 seconds, the remaining 9.5 seconds will not be utilized 
		
		//What if the WebElement does not show u ptill the 10th second?
		// implicit wait will fail the execution and you will get some kind of exception
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// this will terminate the code if the page doesnt load in 10 seconds
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));// this will terminate the entire TestNG if the entire code doesnt run within 100 seconds
		// these timeouts are normally in the @BeforeMethod section of TestNG
		
	}
	
	
	@Test (priority = 1)
	public void tnImplicitWaitTest() {
		
		
		
	}
	
@Test(priority = 2)
public void tnExplicitWaitTest() throws InterruptedException {
		
		
		Thread.sleep(3000);// is an example of explicit wait, no matter what it will wait out the entire duration
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}

@Test(priority = 3)


public void tnExplicitWebDriverWaitTest() throws InterruptedException {

	
	//I want my explicit wait to be smart as well		
		
	
		
		//you use WebDriverWait
		//step 1 Create the object of WebDriverWait class. WebDriver is an interfance WebDriverWait is a class
		//step 2 in the constructor you have to pass two parameters driver reference, the other one is the Duration class
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();
		
		
		
		//driver.findElement(By.linkText("My Account")).click();// lets say My Account is misbehanving 
		
		WebElement loginDropDown = driver.findElement(By.linkText("Login"));
		
		wait.until(ExpectedConditions.elementToBeClickable(loginDropDown)).click();

		//driver.findElement(By.linkText("Login")).click();
		
		//this another smart explcit wait method
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys("seleniumpanda@gmail.com");
		//driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-password"))).sendKeys("Selenium@123");

		//driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.btn.btn-primary"))).click();
		
		//you can use element to be selected parameter for radio button/check boxes
		
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}











}