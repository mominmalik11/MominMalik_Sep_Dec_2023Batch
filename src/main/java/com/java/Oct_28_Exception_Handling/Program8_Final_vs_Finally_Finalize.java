package com.java.Oct_28_Exception_Handling;

public class Program8_Final_vs_Finally_Finalize {

	public static void main(String[] args) {

		// final is a keyword
		//finally is also a keyword but it cannot be used without a block
		
		//final int a=20;
		
		//finally int a = 10;// this wont work because it needs a block 
		
		//final can be used with variable,method and class
		//Interview Question: final method cannot be overriden 
		
		//finally block can be used with try-catch block, try block, but not catch block alone
		//finally block mostly holds clean up code (closing apps)
		
		//finalize method is used for overriding an Object
		
		final int a = 20; //when you use final for a var that means the value of this varble cannot be changed
	}
	
	
	public static final void show() {
		
		
		
		System.out.println("This is the final show method");
		
		
	}
	
	protected void finalize() throws Throwable{
		//this is how you write the finalize method and this can be overriden 
		//this method executes just before Garbage Collection
		// if any object is about to be deleted and if there is some resource related to that Object which is open, then the code inside finalize() metho will close the resource 
		// so technically finalize() method also does the clean up job
		
	}
	
	class Test extends Program8_Final_vs_Finally_Finalize{// parent class is being used
		
		//public static void show();// this method cannot be overriden since it is a final method from parent class 
		
	}

}
