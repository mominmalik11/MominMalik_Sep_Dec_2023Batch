package com.TestNG.FirstProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {
	
	@BeforeSuite
	public void beforesuite() { // CTRL SHIFT O
		System.out.println("Beforesuite is the first annotation to be execute");
	}
	
	@BeforeTest
	public void beforeTest() {// CTRL SHIFT O
		System.out.println("BeforeTest is the second annotation to be executed");
	}
	
	@BeforeClass
	public void beforeclass() {// CTRL SHIFT O
		System.out.println("BeforeClass is the third annotation to be executed");
		
	}
	
	@BeforeMethod
	public void beforemethod() {// CTRL SHIFT O
	System.out.println("Beforemethod is the third annotation to be executed");
	}
	
	@Test
	public void testCase1() { // CTRL SHIFT O
	
	System.out.println("This is the Test Case1 logic");
	}
	
	@Test
	public void testcase2() {// CTRL SHIFT O
	System.out.println("This is the test case2 logic");
	}
	
	@AfterMethod
	public void aftermethod() {// CTRL SHIFT O
		System.out.println("Aftermethod is the next annotation to execute");
	}
	
	@AfterClass
	public void afterclass() {// CTRL SHIFT O
		System.out.println("After class is the next annotation to execute");

	}
	
	@AfterTest
	public void aftertest() {// CTRL SHIFT O
		System.out.println("After test is the next annotation to execute");
	}
	
	@AfterSuite
	public void aftersuite() {// CTRL SHIFT O
		System.out.println("After suite is the next annotation to execute");
	}
	
}
