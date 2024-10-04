package com.testscenarios;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class AnnotationsDemo {
	@Test
	public void tc01() {
		// Develop the code for testcase1
		System.out.println("TC01");
	}

	@Test
	public void tc02() {
		// Develop the code for testcase2
		System.out.println("TC02");
	}

	@Test
	public void tc03() {
		// Develop the code for testcase3
		System.out.println("TC03");
	}

	@AfterMethod
	public void afterMethod() {
		//develop the screenshot code
		//This method will execute each and every testcase
		System.out.println("Screenshot");
	}

}
