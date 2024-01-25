package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import org.testng.annotations.Test;

public class TestCase_In_AnotherClass {
	
	//give the DataProvider in another class you want to connect to a name
	
	@Test(dataProvider = "dataCheck", dataProviderClass = DataProvider_in_Different_Class.class)// write this attaching this test to the dataProvider in another class
	public void tryingToConnectDataProviderInAnotherClass(String browserName, String username, String password, int mob_no) {// the parameterization remains the same
		
		System.out.println(browserName + "--" + username + "--" + password + "--" + mob_no);

		
		
	}

}
