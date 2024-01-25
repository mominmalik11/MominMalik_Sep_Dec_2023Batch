package com.automation.Nov11_Mouse_Actions_in_Selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void easeMyTripMouseActions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Actions class are a class which will help with mouse and keyboard intercations (implicit/explicit waits are action classes as well
		// create object of Actions class, or instatiate it, then pass driver reference in the constructor
		
		Actions action = new Actions(driver); //the contstructor cant remain empty so it takes the driver reference
		
		//click and hold
		
		//click and release
		
		//context click - Right click
		
		//Back click
		
		//Forward click (special mouses)
		
		// double click (special mouse)
		
		//move to element
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"spnMyAcc\"]"));
		action.moveToElement(myAccount).build().perform();
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"shwlogn\"]"));
		action.moveToElement(loginButton).click().build().perform();// you have to add build and preform or it wont do the action
		//move by offset - dragging an object 
		
		//drag and drop
		
		//you can use jqueryui.com to see cooler mouse interactions 
		
		
	}
	
	
	@Test
	public void draggableMouseActions() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//some websites are old and you need to handle the frame clickable option before inspecting WebElements - they are not part of good design
		//frames are also WebElements, if there is more than one frame on the site you have to datamine the specific element 
		Actions action = new Actions(driver);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));//this will show you the total number of frames
		System.out.println("Total Number of frames are :" + totalFrames.size());
		driver.switchTo().frame(0); // indexing position in the contructor indicates which frame you want to move to if there were more than one, indexing starts
		// at 0 so if there is only one frame you write 0 (which is considered the first position)
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		action.dragAndDropBy(source, 100, 200).build().perform();// the numbers indicate the x and y axis 
		
		}
	@Test
public void dragAndDropMouseAcctions() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//some websites are old and you need to handle the frame clickable option before inspecting WebElements - they are not part of good design
		//frames are also WebElements, if there is more than one frame on the site you have to datamine the specific element 
		Actions action = new Actions(driver);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));//this will show you the total number of frames
		System.out.println("Total Number of frames are :" + totalFrames.size());
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		action.dragAndDrop(source, destination).build().perform();
		
		
		
		
	
}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
