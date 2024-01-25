package com.automation.Nov11_ScreenRecording;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Recording_Login_Test {
	
	public WebDriver driver;
	
	
	@Test
	public void recordingLoginTest() throws Exception {
		
		
		ScreenRecorderUtil.startRecord("recordingLoginTest");//with thew screen record util this is how you start recording whichever method you want
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		ScreenRecorderUtil.stopRecord();// this is how you stop record 


		
		
		
	}

}
