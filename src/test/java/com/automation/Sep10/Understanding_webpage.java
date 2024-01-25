package com.automation.Sep10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_webpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		// WebElement signinLink = driver.findElement(By.className("signin"));
		//signinLink.click();

		// shorter version

		driver.findElement(By.className("signin")).click();

		// clicks sign on link, you have to find the element by clicking inspect on the
		// page
		// copy the class="" and then type in code

		//WebElement usernameTextBox = driver.findElement(By.id("login1"));
		// shorter version
		
		driver.findElement(By.id("login1")).sendKeys("misformomin@gmail.com");

		// clicks onto the user name box found by inspecting and seeing it has an id
		// locator

	    //usernameTextBox.sendKeys("misformomin@gmail.com");
		// types in the text written after sendKeys
		
		driver.findElement(By.name("passwd")).sendKeys("1");
		
		//WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		// Goes to password textbox
		//passwordTextBox.sendKeys("1");
		// WebElement clickSignIn = driver.findElement(By.className("signinbtn"));
		// clickSignIn.click();
		
		driver.findElement(By.className("signinbtn")).click();

	}

}
