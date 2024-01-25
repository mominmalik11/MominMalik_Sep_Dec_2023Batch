package com.automation.Oct21_Application_Of_OOPs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	// these were the common code in the login, register, and searchProduct test
	// casses, we moved the common code to the testBase class
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;

	// I will create a Constructor of this TestBase and write the Properties file
	// code in the constructor and I will use that Constructor
	// in all the Child Classes

	public TestBase() throws Exception {

		prop = new Properties();
		 ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\Oct21_Application_Of_OOPs\\config.properties");
		
		prop.load(ip);

	}

	public WebDriver initializeBrowserAndOpenApplication(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		return driver;

	}

}
