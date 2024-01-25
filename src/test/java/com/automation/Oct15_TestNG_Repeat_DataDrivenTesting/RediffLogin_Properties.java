package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffLogin_Properties {
	
	public WebDriver driver;
	
	@Test
	public void rediffLogin() throws Exception {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\Oct15_TestNG_Repeat\\config.properties"); //this cant be empty
		
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		
		
	}
	

}
