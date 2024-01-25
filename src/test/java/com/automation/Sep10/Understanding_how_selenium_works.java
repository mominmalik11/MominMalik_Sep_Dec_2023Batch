package com.automation.Sep10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_how_selenium_works {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); // Remember ctrl shift O to import packages library
		// all this code does is open a blank chrome browser
		driver.manage().window().maximize();
		// all this does is open chrome and maximizes the window
		driver.manage().deleteAllCookies();
		// this will open chrome and delete all cookies then open google
		driver.get("https://google.com");
		// this will open chrome, max the window, and open google
		driver.switchTo().newWindow(WindowType.TAB);
		// opening a new tab after opening chrome 
		driver.get("https://amazon.com");
		//opening amazon in new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		// opens a new window 
		driver.get("https://ign.com");
		//opens  anew window and goes to ign
		driver.quit();
		// closes all opened automated browsers 
		
	}

}
