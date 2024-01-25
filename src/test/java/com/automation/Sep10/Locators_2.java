package com.automation.Sep10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver(); //ctrl shift O
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("bmailicon relative")).click();
		
		// this class name wont work because it is knowns as a compound class, it has a space between the words 
		// that means it has two values and you cant search it this way
		
		
		
	

	}

}
