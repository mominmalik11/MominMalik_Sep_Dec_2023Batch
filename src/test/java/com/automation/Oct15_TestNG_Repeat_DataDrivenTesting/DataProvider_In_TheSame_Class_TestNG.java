package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_In_TheSame_Class_TestNG {
	
	//@DataProvider is an annotation in TestNG. You cannot use it until you write your method
	
	//Rules associated with @DataProvider
	//1 it returns a 2-D Object Array
	//2 You have to pass the data in forms of rows and cols
	//3 you have to create a @Test that connects @Test with @DataProvider. There are two ways to do this
		//pass data provider = "nameofthemthodin@DataProvider
		// give a name to the @DataProvider and in @Test(pass name of @DataProvider)
	//4 you have to parameterize the methond @Test with respect to no of cols ( you cant leave test method blank)
	
	
	@Test(dataProvider = "getData")// this is step 3
	public void loginTest(String browserName, String username, String password, int mob_no) {//step 4
		
		System.out.println(browserName + "--" + username + "--" + password + "--" + mob_no);
		
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() { //change from void when youre coding return data;
		
		//lets design a 2-D Object Array
		
		Object[][] data = new Object[3][4]; //3 rows 4 cols
		
		//lets pass  the data in forms of rows and cols
		
		data[0][0] = "chrome"; //String
		data[0][1] = "username1";//String
		data[0][2] = "password1";//String
		data[0][3] = 8799695;// int
		
		data[1][0] = "firefox";
		data[1][1] = "username2";
		data[1][2] = "password2";
		data[1][3] = 8799696;
		
		data[2][0] = "edge";
		data[2][1] = "username3";
		data[2][2] = "password3";
		data[2][3] = 8799697;
		
		return data;
		}
	
	
	
	
	
	
	

}
