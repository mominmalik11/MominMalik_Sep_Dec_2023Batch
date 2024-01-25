package com.TestNG.Oct1;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Oct10_ClassAssignment {
	
	public static Properties prop;
	public static Properties dataprop;
	public static FileInputStream ip;
	public static FileInputStream ip1;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//create 2 properties file
		//config.properties
		//testdata.properties
		//Create validLoginTest method
		//create invalidLoginTest method
		//mandatoryRegisterFields method
		//implement DataTimeStamp
		
		 prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct1\\config.properties");
		prop.load(ip);
		
		dataprop = new Properties();
		ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct1\\testdata.properties");
		prop.load(ip);
		
		
		Date date = new Date();
		System.out.println(date);
		String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");// make the date time stamp into string and replace all the spaces
		// with underscore and the : with underscore
		System.out.println(emailTimeStamp);
	
		
		dataprop.load(ip1);
		validLoginTest();
		invalidLoginTest();
		
		
		

	}
	
	public static void validLoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualValidLogin = driver.findElement(By.linkText("Edit your account information")).getText();//dont forget .gettext at end
		String expectedValidLogin = prop.getProperty("validLogin");
		Assert.assertTrue(actualValidLogin.contains(expectedValidLogin));//ctrl shift O
		
	}
	public static void invalidLoginTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarningMessage = dataprop.getProperty("emailPasswordMismatchWarning");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}
		public static void mandatoryRegisterValid() {
			WebDriver driver = new ChromeDriver();
						
			
			
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("Selenium"));
			driver.findElement(By.id("input-lastname")).sendKeys("Selenium");
	
			
			
		
			
			
			
			
			
		}

}
