package com.automation.Sep16;

public class Whileloop_classassignment {

	public static void main(String[] args) {
		
		print1to10AndAdd1to10();

	}
	
	public static void print1to10() {
		
		int i=0;
		while(i<10) {
			System.out.println(i+1);
			i++;
			
		}
		
		
		
	}
	
	public static void print10to1() {
		int i=11;
		while(i>0) {
			System.out.println(i-1);
			i--;
			
		}
	}
	
	public static void print1to10AndAdd1to10() {
		int i=1;
		int sum = 0;
		while (i<10) {
			System.out.println(i);
			sum = sum+i;
			i++;
			System.out.println("The total of the sum is : "+sum);
			
		}
		
		
		
			
		
	}



	
	}
	

