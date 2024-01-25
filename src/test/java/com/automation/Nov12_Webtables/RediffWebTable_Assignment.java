package com.automation.Nov12_Webtables;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffWebTable_Assignment {
	
	public WebDriver driver;
	
	
	
	@Test
	public void assignment1() {
		
		
		//please find the Current price (RS) of Modern Steel
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		String currentPrice = driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[929]/td[4]")).getText();
		System.out.println("The current price of modern steel is : " + currentPrice);
		
		
	}
	
	@Test
	public void assignment2() {
		
		//determine the current price(RS) of the company present in the 2000th row
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		//WebElement companyName = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[2000]/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

		
		
	}
	
	@Test
	public void assignment3() {
		//print the first five rows, with each column
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate webtable element
		
		driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		
		//locate all the rows
		List<WebElement> rowsNumber = driver.findElements(By.tagName("tr"));
		
		//print the first five rows and cols
		//for rows
		for (int i = 0; i < Math.min(5, rowsNumber.size()); i++ ) {
			
			List<WebElement> columnsNumber = rowsNumber.get(i).findElements(By.tagName("td"));
		for (int j=0; j < Math.min(5, columnsNumber.size()); j++) {
			
			System.out.print(columnsNumber.get(j).getText() + "\t" );
		}
		System.out.println();
			
	
			
			
			
		}
		
		
		
		
	}
	
	
		
		
		
		
		
		
		
		
	}
	


