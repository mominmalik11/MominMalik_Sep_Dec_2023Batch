package com.java.Oct_28_Exception_Handling;

public class Program9_Possible_Combos_Try_catch_finally {

	// only try is not possible
	//only catch is not possible
	//only finally is not possible
	//try-catch works
	//try-finally works
	//try catch finally works
	
	//can i have one try and multiple catches? YES
	//conditions apply
	//1 if the catch blocks have the same class  name it will not work 
	//2 the first catch block cannot have the parent class
	//3 the first catch block can have the child Class and the second catch block can have the parent class 
	
	
	
	//Can a try block have a try block have a try-catch block? yes it can
	//can a catch block have a try catch block? YES
	
	
	public static void main(String[] args) {
		
		try {
			int a =10, b=0;
			int c = a/b;
System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}//catch (ArithmeticException e) {// this wont work becase the catch block from before is handling the risky code 

		}

	}


