package com.java.sep_10_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeniningMulitpleTabs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // remember to hit ctrl shift o
		
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);// opening a new tab
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);	// opening a new window
		driver.get("https://costco.com");
		
		
				

	}

}
