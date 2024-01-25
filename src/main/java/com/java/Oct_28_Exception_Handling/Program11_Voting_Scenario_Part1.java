package com.java.Oct_28_Exception_Handling;

public class Program11_Voting_Scenario_Part1 extends RuntimeException {
	
	//What is the voting age in USA?
	//18 years
	
	//How can you use exception handling to emulate this scenario?
	
	//Object class is the parent of all classes in Java
		// Throwable
			// Exception   Error
							// RunTime Exception(unchecked)
	
	//create the contructor of this class
	
	Program11_Voting_Scenario_Part1(String message){
		super(message);
		
	}

}
