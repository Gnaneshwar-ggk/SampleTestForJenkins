package com.ggktech.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteListenerExample {
	@Parameters("ui")
	@BeforeSuite
	public void beforeSuite(String parm) {
		System.out.println("before suite is called, ui value: " + parm);
	}
	
	@Test
	public void t() {
		System.out.println("test method is called");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite is called");
	}
}
