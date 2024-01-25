package com.TestNG.Oct1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFrom_PropertiesFile {
	
	public static Properties prop;// this needs to be declared globally
	
	public static FileInputStream ip;// this needs to be declared globally

	public static void main(String[] args) throws IOException {
		//Step 1 Create properties File
		//Step 2 The data should be saved in key = value, no double quotes or single quotes
		//step 3 creat the Object of Properties Class
		//step 4 Creae the Object of the FileInputStream class and pass the path og the properties file through the constructor object
		//step 5 load the file
		
		Properties prop = new Properties();// ctrl shift o
		
		System.out.println(System.getProperty("user.dir"));
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct1\\config.properties");
		// this bracket cannot remain empty you put the path of properties file
		
		prop.load(ip);
		
		//login();
		
		
		

	}
	
	
	public static void login() { //with property being delcared you can use the properties file to create code
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
}
