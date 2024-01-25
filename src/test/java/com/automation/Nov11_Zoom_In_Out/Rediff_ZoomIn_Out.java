package com.automation.Nov11_Zoom_In_Out;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_ZoomIn_Out {
	
	public WebDriver driver;
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // you have to cast this script, casting measn to change data type from one type to another
		js.executeScript("document.body.style.zoom = '300%' ;"); // this is how you zoom in on a page
		
		
		Thread.sleep(1000);
		js.executeScript("document.body.style.zoom = '30%' ;"); // this is how you zoom out
		
		Thread.sleep(1000);
		js.executeScript("document.body.style.zoom = '100%' ;"); // this is how you bring it back to normal 
		
		
		
	}
	

}
