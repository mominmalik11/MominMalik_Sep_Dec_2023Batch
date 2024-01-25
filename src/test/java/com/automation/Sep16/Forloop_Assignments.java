package com.automation.Sep16;

public class Forloop_Assignments {
	
	//more streamlined loop method

	public static void main(String[] args) {
		multipleof9Till20andAddthosemulti();
		

	}
	
	public static void print1to100() {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " "); // deleting the ln in print and adding the space will make it show up horizontally
		}
		
	}
	public static void multipleof9Till20andAddthosemulti() {
		int sum = 0;
		for(int i=9; i<=9*20; i=i+9) {
			System.out.println(i);
			sum= i+sum;
			
			
		}System.out.println("The sum of the multiples are: " + sum);
		
		
	}
	
		
	
	}



