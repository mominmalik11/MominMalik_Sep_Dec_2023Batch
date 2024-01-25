package com.java.Oct10_OOPS_Pillar1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.Sep_30_Day9_SpecialClasses.Util;



public class Applying_Automation_Rules_MainVsTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		//setup("https://tutorialsninja.com/demo", "seleniumpanda@gmail.com", "Selenium@123");
		
		//rediffLogin("https://rediff.com", "seleniumpanda@rediffmail.com", "Selenium@123");
		
		registerTN("https://tutorialsninja.com/demo","Momin", "Malik", "3018799999", "mominmalik69", "mominmalik69");
		}
	
	public static void setup(String url, String email, String password) {
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// this is a wati condition 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
		
		}
	
	public static void rediffLogin( String rediffUrl, String rediffUsername, String rediffPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// this is a wati condition 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(rediffUrl);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(rediffUsername);
		driver.findElement(By.id("password")).sendKeys(rediffPassword);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.quit();}
		
		public static void registerTN(String url,String firstName, String lastName, String telephone, String password, String confirmPassword) {
					// you need to use the util class to use new emails with time stamps since this one will be taken after
					// the first test
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// this is a wati condition 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
			driver.get(url);
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("input-firstname")).sendKeys(firstName);
			driver.findElement(By.id("input-lastname")).sendKeys(lastName);
			driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
			driver.findElement(By.id("input-telephone")).sendKeys(telephone);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.quit();
			
			
		}
		
		
		
		
		
	}


