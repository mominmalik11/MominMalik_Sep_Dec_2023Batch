package com.automation.Oct14;

import org.testng.annotations.Test;

public class Executing_A_TestCase_Multiple_Times {
	
	
	@Test(priority = 1)
	public void logic1() {
		System.out.println("Hello World");
		
	}
	
	@Test(priority = 2)
	public void logic2() {
		System.out.println("Hello World");
		
	
	
	
	
	}
	
	@Test(priority = 3, invocationCount = 5)//This test will now run 5 times
	public void logic3() {
		System.out.println("Hello World youve been great");
		
	
	
	}
	
	

}
