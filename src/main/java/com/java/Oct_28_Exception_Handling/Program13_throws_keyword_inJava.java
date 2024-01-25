package com.java.Oct_28_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program13_throws_keyword_inJava {

	public static void main(String[] args) throws FileNotFoundException {
		
		findingFile(); // there is an error here because the throws keyword indicates to the caller method(here) that there is an exception that needs handling
						// essentially you have to use another throws declaration by mousing over the error line or surround by trycatch block

	}
	
	public static void findingFile() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream(""); // you can use throws exception here, the compiler is basically asking you to handle the exception. you can\
		// use both trycatch block or throws
	}

}
