package com.automation.Oct29_TestNG;

import org.testng.annotations.Test;

//learning from PnT- I can show you max5-6 Test Cases
//in real time project there might 500,600,2000 test cases
//Segregate or partition them into Groups

//Groups
//How to create Groups?
//Execute Groups
//MetaGroups? For example you want to define testCases that will run overnight every night = "OvernightTestCases" (check testNGGroups xml file
//Regular Expression
//Group at a Class level

public class Groups {
	
	@Test(groups = {"smoke"})//this test will be grouped with smoke
	public void tc1() {
		System.out.println("This is T1 logic");
		}
	
	@Test(groups = {"smoke" , "sanity"})// this test case has multiple groups
	public void tc2() {
		System.out.println("This is T2 logic");

}
	
	@Test(groups = {"smoke" , "sanity" , "regression"})
	public void tc3() {
		System.out.println("This is T3 logic");

}
	
	@Test(groups = {"windows.sanity" })// this codes that you only want this to run in windows
	public void tc4() {
		System.out.println("This is T4 logic");

}
	
	@Test(groups = {"regression"})
	public void tc5() {
		System.out.println("This is T5 logic");

}
	
	
	
	
	
	
	
}
