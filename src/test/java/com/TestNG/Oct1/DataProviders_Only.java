package com.TestNG.Oct1;

import org.testng.annotations.DataProvider;

public class DataProviders_Only {
	@DataProvider(name = "TN")
	public Object[][] getDataTN() {
		
		Object[][] data = {{ "seleniumpanda@gmail.com" , "Selenium@123"},
				           { "seleniumpanda1@gmail.com" , "Selenium@123"},
							{"seleniumpanda2@gmail.com" , "Selenium@123"},
							{"seleniumpanda3@gmail.com" , "Selenium@123"}};
		
		return data;
	}

	@DataProvider(name = "Rediff")
	public Object[][] getDataRediff() {
		Object[][] data = {{ "seleniumpanda@rediffmail.com" , "Selenium@123"},
		           			{ "seleniumpanda1@rediffmail.com" , "Donkey@123"}};
					
		
		return data;
		
		
		
	}
	
	
}
