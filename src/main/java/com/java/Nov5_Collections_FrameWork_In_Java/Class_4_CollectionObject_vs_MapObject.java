package com.java.Nov5_Collections_FrameWork_In_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class Class_4_CollectionObject_vs_MapObject {
	
	
	
	
	// Collection is the interfance
	
	
	//Map is also an interface
	
	
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList(); // extends collection interface aka this inherits collection interface
		
		a1.add(10); // all code in the parantheses are objects store in the array object above, look at screenshot
		a1.add("Selenium");
		a1.add(true);
		a1.add('c');
		
		HashMap hm = new HashMap();// extends the map interface, which needs to be store in key-value pair
		
		hm.put(101, "John"); //this is how you store objects in map interface, see screen shot
		hm.put(102, "Tina");
		hm.put(103, "Ronald");
		
		
		
		
	}

}
