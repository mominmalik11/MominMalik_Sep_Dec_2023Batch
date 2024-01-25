package com.java.Oct_28_Exception_Handling;

public class Program5_Try_Catch_Block {
	
	
	public static void main(String[] args) {
		
	//how to write try/catch block
		
		//Try {
				//this is where you write your risky code aka where the exception is
		//}
		
		//catch(Exception e){
			//handling code
		//}
		
		tryCodeIsNotRisky();
		//example1();
		//example2();
		
	}
	
	public static void example1() {
		
		//in this example we will work with a RunTime/Unchecked Exception
		
		try {
			int a = 10, b = 0;
			int c = a/b; // this is where the unchecked exception is taking place
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The exception code has been handled");
		}	
		}

public static void example2() {

	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	try {
		System.out.println(5/0);//but what if you change this to 5/0. Arithmetic Exception. So next lines will not execute, so right click and surround with
								// try-catch block
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("6");
	System.out.println("7");
	System.out.println("8");
	System.out.println("9");
	System.out.println("10");


	
	
}

public static void tryCodeIsNotRisky() { //this code isnt risky at all lets see what happens when you put it in a try-catch block? Absolutely nothing
	// java just ignore it and prints the good code
	 try {
		int a=10, b=2;
		 int c = a/b;
		 System.out.println(c);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("There is no problem in the try block still i am using try-catch");
	}
	
}





}


