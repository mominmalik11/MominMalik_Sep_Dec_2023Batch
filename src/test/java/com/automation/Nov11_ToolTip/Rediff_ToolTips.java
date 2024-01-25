package com.automation.Nov11_ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_ToolTips {
	
	public WebDriver driver;
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//when you hover over a WebElement on a webpage a little bubble icon pops up describing what it is; that is a tool tip.
		//the title attribute in DOMS is the is the tool tip
		// the tooltip for create account
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
		// we need to datamine the tool tip for this
		
		//use the Title Attribute
		String tooltipText = createAccountLink.getAttribute("title");
		System.out.println("This is the tooltip text for Creating an account : " + tooltipText);
		
		WebElement rediffMailToolTip = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]"));
		
		String mailTooltipText = rediffMailToolTip.getAttribute("Title");
		System.out.println("This is the tooltip for rediff mail : " + mailTooltipText);
		
		WebElement moneyTooltip = driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.mailicon"));
		
		String moneyToolTipText = moneyTooltip.getAttribute("title");
		System.out.println("This is the tooltip for hovering over money web element : " + moneyToolTipText);
		
		
		
		
		
		
	}
	

}
