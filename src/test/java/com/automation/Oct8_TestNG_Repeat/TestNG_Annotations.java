package com.automation.Oct8_TestNG_Repeat;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	@BeforeSuite
	public void beforeSuiteExecutesFirst() { //this annotation supports @Test
		System.out.println("This is before suite and it will execute first");
		
	}
	@BeforeTest
	public void beforeTestExecutesSecond() { //this annotation supports @Test
		System.out.println("BeforeTest executes after @BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClassExectutesThird() { //this annotation supports @Test
		System.out.println("@BeforeClass exectutes after @BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethodExectutesFourth() { //this annotation supports @Test
		System.out.println("@BeforeMethod executes after @BeforeClass");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is testCase1");
	}
	@Test
	public void testCase2() {
		System.out.println("This is testCase2");
	}
	
	@AfterMethod
	public void afterMethodExecutesSixth() {
		System.out.println("@afterMethod exectues after @Test");

	}
	
	@AfterClass
	public void afterClassExectutesSeventh() {
		System.out.println("@AfterClass exectues after @AfterMethod");

	}
	
	@AfterTest
	public void afterTestExectutesEighth() {
		System.out.println("@AfterTest executes after @AfterClass");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite executes after @AfterTest");
		
	}

}
