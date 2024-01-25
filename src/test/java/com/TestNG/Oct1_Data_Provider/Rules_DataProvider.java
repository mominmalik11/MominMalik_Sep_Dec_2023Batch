package com.TestNG.Oct1_Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//rule 1: it returns a 2-dimensional Object Array
//rule 2: You have to pass the data in rows and cols format
//rule 3: Connect the test casee with the @DataProvider by passing dataProvider="Name@Methodin@dataProvider"
//rule 4: you have to parameterize the method in @Test with total num of cols taking care of the data types

public class Rules_DataProvider {
	
	@Test(dataProvider = "getData")// this annotation allows the data from the bottom to connect to the Test here (step 3)
	public void loginTest(String username, String password, int emp_id, boolean promotion){//step 4
		
		System.out.println(username + "---" + password + "---" + emp_id + "----" + promotion);
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data = new Object [3][4]; //total rows are 3 and cols are 4
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 987654321;
		data[0][3] = true;
		
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 987654;
		data[1][3] = false;
		
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 98765432;
		data[2][3] = true;
		
		return data; 
		
				
		
		
	}

}
