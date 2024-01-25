package com.java.Oct_28_Exception_Handling;

import java.util.Scanner;

public class Program12_Scenario_Part2_VotingModule {

	public static void main(String[] args) {
		
		//create a scanner class
		
		Scanner scan = new Scanner(System.in); //dont forget to add System.in
		System.out.println("Enter Age : " );
		try {
			int age = scan.nextInt();
			if( age < 18 ) {
				throw new Program11_Voting_Scenario_Part1("Not eligible for voting");
			}else {
				
				System.out.println("Eligible for voting");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}

}
