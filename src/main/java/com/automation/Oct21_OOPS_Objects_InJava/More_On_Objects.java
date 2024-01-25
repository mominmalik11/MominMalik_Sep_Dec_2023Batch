package com.automation.Oct21_OOPS_Objects_InJava;

import org.openqa.selenium.chrome.ChromeDriver;

public class More_On_Objects {

	public static void main(String[] args) {

		//To understand the concept of Objects even better you have to know 3 things
		
		//1 Declaration 
		//2 Instantiation
		//3 Initialization
		ChromeDriver driver = new ChromeDriver(); //this class has been instantiated since you made an object out of the class
		//ChomeDriver is the class
		//driver is the reference
		// new ChromeDriver() is the object
		//ChromeDriver() is the constructor
	}
	
	class Animal{
		
		//Declaration
		
		Animal Buzzo;
		
		//Instantiation
		//this is when memory is allocated to the Object
		
		Buzzo = new Animal();
		
		
		//Initialization
		//new keyword is followed by a call to the constructor, this call initializes the new Object
		
		
	}

}
