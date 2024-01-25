package com.java.Oct_28_Exception_Handling;


public class Program7_FInally_block {

	public static void main(String[] args) {
		
		//Finally block will execute no matter exception occurs or not
		//you can execute finally block with only try block. You can choose not to use catch block but again if exception is not handled it 
		//using only Finally block does not work however 

		//case1();// there was exception
		//case2();// the code is clean, wiil finally block be executed? Yes it will 
		case3();// there is not catch block,
	
	}
	
	
	public static void case1() {
		try {
			int a = 10, b =0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("No matter what this will be printed");
		}
	}
	public static void case2() {
		try {
			int a = 10, b =2;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("No matter what this will be printed");
		}
	
	

}
	public static void case3() {// there is no catch block in this instance, will the finally block execute? Yes it will 
		try {
			int a = 10, b =0;
			int c = a/b;
			System.out.println(c);
		} 
		finally {
			System.out.println("No matter what this will be printed");
		}
}
}
