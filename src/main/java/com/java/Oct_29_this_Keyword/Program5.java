package com.java.Oct_29_this_Keyword;


public class Program5 {
	
	//3 .this() can be used to invoke current class constructors
	
	
	
	
	Program5() { //this is a constructor
		System.out.println("No argument constructor");
	}
	
	Program5 (int i){//overload it
		 this();//this keyword will invoke current class constructor above first then the bottom constructor
		System.out.println("Parameterized Constructor");
		
	}
	
	


	public static void main(String[] args) {
		
		//Program5 prog = new Program5();// this will call no argument constructor 
		Program5 prog = new Program5(10); // this will call the parameterized constructor
	}

}
