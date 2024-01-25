package com.java.Oct10_OOPS_Pillar1;

public class ParameterizedMethods {

	public static void main(String[] args) {

		
	}
	
	// an example of non-parameterized method
	public static void addingTwoIntegers() {
		
	}
	
	//an example of parameterized method
	public static String joiningTwoStrings(String S1, String S2) {//S1 and S2 have been intialized
		String S3 = S1+S2;
		S1 = "hello";//no need to write String S1 = since S1 has already been declared a string, youll get an error if you do
		S2="world";
		System.out.println(S3);
		return S3;
		
	}
	
	
	
	

}
