package com.automation.Nov12_Screenshots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	public ChromeOptions options;




	@Test
	public void openWeatherMap() throws Exception {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://openweathermap.org");
		
		//step 1 whichever element you want to screenshot of highlight it seperately 
		
		WebElement logo = driver.findElement(By.cssSelector("body > main > div.section.where-to"));
		
		//step 2 using the logo we can call a method known as getScreenShotAs
		
		File source = logo.getScreenshotAs(OutputType.FILE); //CTRL SHIFT O
		
		//Step 3 manually create the screenshots folder where you want this screenshot saved C:\Users\misfo\eclipse-workspace\PNT_2023_weekendBatch\test-output\Screenshots
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\openWeatherMapLogo.png");
		//make sure to add the \\openWeatherMapLogo.png extension at the end or it wont work 
		
		//Step 4 use the FileHandler class to move the source webelement to the desination file
		
		FileHandler.copy(source, destination);
		
		
		
		
	}
	@Test
	
	public void shaadiLogoScreenshot() throws IOException {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.shaadi.com/");
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]"));
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\ShaadiLogo.png");
		
		FileHandler.copy(source, destination);
		
		
		
		
	}




}


