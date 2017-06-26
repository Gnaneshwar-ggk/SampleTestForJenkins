package com.ggktech.tests;

import org.testng.annotations.*;

public class InvokedMethodListenerExample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite is called");
	}
	
	@Test
	public void test1() {
		System.out.println("@test method is called");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite is called");
	}	
}
