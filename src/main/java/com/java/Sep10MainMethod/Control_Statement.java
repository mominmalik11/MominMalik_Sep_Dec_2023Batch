package com.java.Sep10MainMethod;

public class Control_Statement {

	public static void main(String[] args) {
		
		ifControlStatement();
		ifelsecontrolstatement();
		ifelseifcontrolstatement();
		
		

	}
	
	public static void ifControlStatement() {
		if(200>100) {
			System.out.println("I am correct");
		}
	}
	
	public static void ifelsecontrolstatement() {
		if(2==4) {
			System.out.println("my condition is true");
			
		}else { 
			System.out.println("The above condition is dead code");
			
		}
		
	}
	
	public static void ifelseifcontrolstatement() {
		int i=1;
		int j=2;
		int k=3;
		int l=4;
		int m=5;
		// i want to determine the largest of these 3 numbers
		
		if(i>k && i>j) {
			System.out.println("i is the largest");	
			}else if(j>i && j>k) {
				System.out.println("j is the largest");
				}else if(l>m && l>k && l>j && l>i) {
					System.out.println("l is the largest: ");
				}else if (m>l && m>k && m>j && m>i) {
					System.out.println("m is the largest: " + m);
				}
	}

}
