package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class How_To_Read_From_PropertiesFile {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	
	@Test
	public void readingFromPropertiesFile() throws Exception {
		//step 1 -create te object of Properties Class
		
		Properties prop = new Properties();
		
		//step 2-create the object of FileInputStream class and pass the path of the property file in here
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\Oct15_TestNG_Repeat\\config.properties"); //this cant be empty
		
		//step 3-load the properties file
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
		//driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
