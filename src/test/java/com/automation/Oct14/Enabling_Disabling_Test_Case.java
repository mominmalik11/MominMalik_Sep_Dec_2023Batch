package com.automation.Oct14;

import org.testng.annotations.Test;

public class Enabling_Disabling_Test_Case {
	
	
	
	@Test(priority = 1)
	public void logic1() {
		System.out.println("this is logic1");
		
	}
	
	
	@Test(priority = 2, enabled = false)// This test case is disabled, do not write disabled as it does not exist(disabled = true)
	public void logic2() {
		System.out.println("this is logic2");

		
		
	}
	
	@Test(priority =3)
	public void logic3() {
		System.out.println("this is logic3");

		
	}

}
