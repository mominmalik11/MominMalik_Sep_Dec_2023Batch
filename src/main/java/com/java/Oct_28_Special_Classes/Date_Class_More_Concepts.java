package com.java.Oct_28_Special_Classes;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Date_Class_More_Concepts {
	
	public static  SimpleDateFormat sdf;

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date); // will simply print the date
		String emailTimeStampString = date.toString().replace(" ", "_").replace(":", " ");// changes date to string and replaces characters
		System.out.println(emailTimeStampString);
		// you want a different date format??
		// MM/dd/yyyy
		// MM/dd/yyyy hh:mm:ss
		
		//this is known in java as simple date format
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");// you must enter code into constructor 
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
		
	}

}
