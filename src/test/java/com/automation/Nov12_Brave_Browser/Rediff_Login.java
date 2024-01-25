package com.automation.Nov12_Brave_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Rediff_Login {
public WebDriver driver;
public ChromeOptions options;

//step 1 open google and download and install brabe browser
// step 2 copy the path of the brave,exe application C:\Program Files\BraveSoftware\Brave-Browser\Application
// step 3 you have to use ChromeOptions and with the options reference call the setBinary method and pass the mentioned in step 2


@Test
public void checkingBraveBrowser() {
	
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");// dont forget to add the brave.exe at the end!
	options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	driver.quit();

	
	
	
	
}

}
