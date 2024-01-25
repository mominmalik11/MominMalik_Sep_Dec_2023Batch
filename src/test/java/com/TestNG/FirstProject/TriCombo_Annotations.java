package com.TestNG.FirstProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_Annotations {
	
	// Generally only three annotations are used before method, test, after method
	
	
	@BeforeMethod
	public void Setup() {
		System.out.println("Begin");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Roses are Red");
	}
	
	@Test
	public void testcase2() {
		System.out.println("The rose is Pink");
	}
	
	@Test
	public void Testcase3() {
		System.out.println("The roses are Yellow");
	}
	
	@AfterMethod
	public void closing() {
		System.out.println("End");
	}

}
