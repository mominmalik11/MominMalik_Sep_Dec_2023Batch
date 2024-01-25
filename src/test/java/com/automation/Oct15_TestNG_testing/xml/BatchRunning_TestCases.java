package com.automation.Oct15_TestNG_testing.xml;

import org.testng.annotations.Test;

public class BatchRunning_TestCases {
	//BatchRunning- mulitple test cases can be run together
	
	//in one java class you can have multiple test cases
	//There are multple Java classes and each java class has multiple test cases
	
	//Step 1- create multiple classes with test cases is loginTest, registerTest, searchProductTest
	//Step 2- select all the classes you want to execute; ctrl click or shift down arrow then right click and click convert to testNG
	//Step 3- click finish on the pop up prompt and there will be a testing.xml file on the bottom under pom.xml
	//Step 4- hit source tab on bottom
	//step 5- delete thread count text after test tab and before name ( i thnk its row 4)
	//step 6- the order of the tests dictate the order they will be executed
	//step 7- right click and hit run as testNG Suite
	//step 8- make sure each class as @Test or this will not work
	//step9- you can alster the name of the test and other criteria on top of the testNG xml code
	//step10- you can choose which tests in the xml file to include or exclude by
	
	@Test(priority = 1)
	public void logic1() {
		
		
		
		}
	
	@Test(priority = 2)
	public void logic12() {
		
	}
	
	@Test(priority = 3)
	public void logic3() {
		
		
		
	}

}
