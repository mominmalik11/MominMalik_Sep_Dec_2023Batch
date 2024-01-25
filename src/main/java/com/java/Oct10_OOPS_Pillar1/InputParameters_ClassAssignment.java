package com.java.Oct10_OOPS_Pillar1;

public class InputParameters_ClassAssignment {

	public static void main(String[] args) {

		//Create 5 methods with 2,3,4,5,6  input parameters 
		// Three methods should be of String type, 1 should be of int type, 1 should be of boolean type
		
		twoParameters("Hello ", "Fool");
		threeParameters("Hello ", "you ", "fool");
		fourParameters("Automation", 10, true, 99, "BackFire", 69);
		
	}
	
	public static String twoParameters(String S1, String S2) {
		
         String S3= S1+S2;
         System.out.println(S3);
         return S3;
		
	}
	
	public static String threeParameters(String S4, String S5, String S6) {
		
		String S7= S4+S5+S6;
		System.out.println(S7);
		return S7;
	}
	

public static String fourParameters(String S8, int i, boolean b1, int j,String S9, int k) {
		
	System.out.print(S8);
	System.out.print(i);
	System.out.print(b1);
	System.out.print(j);
	System.out.print(S9);
	System.out.print(k);
	return S8; //the return has to be string since its the first datatype
	
	
	
		
		
	}

}
