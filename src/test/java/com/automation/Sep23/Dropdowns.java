package com.automation.Sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdowns {
public Select select;
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000); //asking selenium to wait for two seconds so dropdown has time to pop up
		driver.findElement(By.name("firstname")).sendKeys("Momin");
		driver.findElement(By.name("lastname")).sendKeys("Malik");
		driver.findElement(By.name("lastname")).sendKeys("Malik");
		driver.findElement(By.name("reg_email__")).sendKeys("Misformomin@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("HerpDerp");
		
		
		//how to automate select dropdown
		//Create object of Select Class
		Select select = new Select(driver.findElement(By.id("month"))); //CTRL SHIFT O
		select.selectByVisibleText("Apr"); // what this does is choose Apr for you. also always choose select by VISIBLE TEXT
		
		
		Select select1= new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("10");
		
		Select select3= new Select(driver.findElement(By.id("year")));
		select3.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@id = 'u_9_5_E+']")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
