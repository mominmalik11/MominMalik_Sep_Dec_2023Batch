package com.automation.Nov11_Dyanmic_DropDown;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Looping_Dropdown_HW_included {
	
	public WebDriver driver;
	
	@Test
	public void easeMyTripTravellersLooping() throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		//pre selection my total passenger selection is 1
		//post selection it will be more or n travellers
		
		//make sure to select the number (1) of travellers not the word traveller webElement
		String preSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Travelers before selection is : " + preSelection);
		
		driver.findElement(By.id("ptravlrNo")).click();// make sure to inspect the entire element not just the word traveller
		
		int Adults = 1;
		while(Adults < 5) {
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[1]/div[2]/button[2]")).click();
		Adults++;
		// this ensure the add traveller plus button gets pressed until the total # of travellers is 5
		
		}
		int Children = 0;
		while(Children < 2) {
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
		Children++;
		// this ensure the add traveller plus button gets pressed until the total # of travellers is 2
		}
		int Infant = 0;
		while(Infant < 1) {
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[3]/div[2]/button[2]")).click();
		Infant++;
		// this ensure the add traveller plus button gets pressed until the total # of travellers is 1
		}
		
		driver.findElement(By.cssSelector("#traveLer")).click();
		driver.findElement(By.cssSelector("#showOWRT > div > div.fss_flex.search_colm > button")).click();
		
		}
	
	@Test
	public void spiceJetsDropdownLooping() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[2]")).click();
		
		int Adults = 1;
		while(Adults<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
			Adults++;
		}
		
		int Children = 0;
		while(Children<3) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Children++;
		}
		
		int Infant = 0;
		while(Infant<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]")).click();
			Infant++;
		}
		
		
		
		
		
		
		
		
	}
}
