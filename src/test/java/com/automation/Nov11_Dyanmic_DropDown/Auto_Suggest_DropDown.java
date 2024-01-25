package com.automation.Nov11_Dyanmic_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto_Suggest_DropDown {

	public WebDriver driver;

	@Test
	public void autoSelectionDropdown() throws Exception {
		
		//when you click on a drop down menu and type in a few characters and the site starts auto suggesting options for you ie when you type New in travel website
		// youll see New york, New Delhi, New Brunswick etc
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#fromCity")).click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("New");
		
		//lets say the selection you want to make is 5  down arrow keys, in this case JFK
		
		int i = 0;
		while(i<5) {
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.DOWN);
			i++;
			
			}
		
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Las");
	int j = 0;
	while(j<1) {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
		j++;
		}
	driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);


		
		
		
		
	}

}
