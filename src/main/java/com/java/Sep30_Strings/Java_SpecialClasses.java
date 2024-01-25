package com.java.Sep30_Strings;

import java.util.Date;

public class Java_SpecialClasses {// this is used when you dont want to keep making new emails to see if automated processes work
									//ie when you need to register a new email 

	public static String main(String[] args) { //CTRL SHIFT O and hit Java Util
		Date date = new Date();
		System.out.println(date);
		String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");// make the date time stamp into string and replace all the spaces
		// with underscore and the : with underscore
		System.out.println(emailTimeStamp);
		return "seleniumpanda"+ emailTimeStamp + "@gmail.com";
		
		
		
		

	}

}
