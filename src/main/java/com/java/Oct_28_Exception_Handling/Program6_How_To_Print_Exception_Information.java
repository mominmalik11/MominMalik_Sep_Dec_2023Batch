package com.java.Oct_28_Exception_Handling;

public class Program6_How_To_Print_Exception_Information {

	public static void main(String[] args) {
		
		try {
			int a = 10, b =0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {// Expception is the Class and e is the object made
			e.printStackTrace();// this will print exception name, description and stack trace (stack trace shows the row that error is 
			System.out.println(e);// this will print exception name and description but it will not print stack trace
			System.out.println(e.toString());// this output will be the same as on top
			System.out.println(e.getMessage());// this output will only print description
		}

	}

}
