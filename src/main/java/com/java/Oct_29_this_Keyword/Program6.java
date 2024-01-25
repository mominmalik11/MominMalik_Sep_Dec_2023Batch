package com.java.Oct_29_this_Keyword;

public class Program6 {

	//4. this can be used to pass as an argument in the method call
	
	void m1(Program6 prog){// passing the class reference in the constructor
		
		System.out.println("I am in the m1 method");
		
	}
	
	void m2() {
		
		m1(this);
		
	}

	
	
	public static void main(String[] args) {
		Program6 prog= new Program6();
		prog.m2();

	}

}
