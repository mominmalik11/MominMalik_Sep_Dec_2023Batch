package com.automation.Sep23;

public class ForLoopInsideForLoop {

	public static void main(String[] args) {
		int weeks = 3;
		int days = 7;
		int i = 1;
		
		while( i<=weeks) {
			System.out.println("Week: " +i);
			for(int j=1; j<=days; j++) {
			System.out.println("Days: "+j);
			
		} 
			i++; }
				
	}

	public static void monthsAndDays() {
		int months = 12;
		int days = 30;

		// outer loop will print each month
		// inner loop will print each day of month

		for (int i = 1; i <= months; i++) {
			System.out.println("Month is :" + i);

			for (int j = 1; j <= days; j++) {
				System.out.println("Day is :" + j);

			}

		}

	}
	
	public static void statesandCities() {
		int states= 50;
		int cities= 3;
		
		//outer loop is states and inner loop is cities
		
		for( int a=1; a <= states; a++) {
			System.out.println("State number is:" + a);
			
		for( int b=1; b<=cities; b++) {
			System.out.println("City Number is:" + b);
		}
		
		
	}

}
	
	
}
