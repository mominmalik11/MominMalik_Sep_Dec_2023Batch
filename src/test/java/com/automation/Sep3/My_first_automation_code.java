package com.automation.Sep3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_first_automation_code {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Ctrl+shift+O to create shortcut (adds line on top)
		driver.manage().window().maximize();
		driver.get("https://www.ign.com"); // always include https://
		driver.quit();
		
		
        WebDriver driver1 = new FirefoxDriver();//Ctrl+shift+O to create shortcut (adds line on top)
		driver1.manage().window().maximize();
		driver1.get("https://www.reddit.com"); // always include https://
		driver1.quit();




		
		
	}

}
