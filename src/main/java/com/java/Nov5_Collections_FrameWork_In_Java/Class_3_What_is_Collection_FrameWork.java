package com.java.Nov5_Collections_FrameWork_In_Java;

import java.util.ArrayList;
import java.util.HashSet;

public class Class_3_What_is_Collection_FrameWork {
	
	
	// collection is a pre defined interface
	// collection (as a general understanding in Java) - is a single entity or an object which can store multiple data
	
	//framework - represents a library
	
	//collection framework - it is a set of pre defined classes, interfaces and methods which is used to store multiple data
	// it contains 2 main packages
	//java.util.Collection - we can store the data directly
	//java.util.Map - we store the data in key-value pair

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10); // all code in the parantheses are objects
		a1.add("Selenium");
		a1.add(true);
		a1.add('c');
		
		HashSet hs = new HashSet();
		hs.add("Python");
		hs.add(false);
		hs.add(20);
		hs.add('d');
		
		//a1 and hs- both are collection Objects which are storing objects in itself, see screenshot
		// what is the diffence between the two collection objects?
		//Objects have different properties. Internally working principle is different *****IMPORTANT INTERVIEW QUESTION*****
		//
		
		

	}

}
