package com.automation.Oct14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_Basic_Concepts {
	
	//Assert a WebPage at how many levels?
	//getTItle
	//getCurrentUrl()
	//getPageSource()
	
	//Assert a webElement?
	//isEnabled
	//isDisplayed()
	//isSelected()
	
	
	
	
	@Test
	public void mathematics() {
		
		System.out.println("Begin");
		System.out.println(2+3);
		System.out.println(5/0);// this test will fail because you cant divide by 0
		System.out.println("End");// this will not be executed since the test before failed
		
	}
	
	
	@Test
	public void mathematics2() {
		
		SoftAssert softassert = new SoftAssert();
		
		//with soft assert the code after the failed code will still execute unlike above with hard assert
		
		System.out.println("Begin");
		System.out.println(2+3);
		//System.out.println(5/0);
		softassert.assertTrue(2>3); //this is false but the below will still execute because this is a softAssert
		System.out.println("End");// this will  be executed even if  the test before failed
		softassert.assertTrue(400 != 400);
		
		softassert.assertAll();// it accumulates all the false statements
		
		
		
		
	}

}
