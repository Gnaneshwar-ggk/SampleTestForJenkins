package com.ggktech.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotationTransformerExample {
	
	@BeforeSuite(description="before suite annotation")
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}
	
	@BeforeTest(description="before test annotation")
	public void beforeTest() {
		System.out.println("in beforeTest");
	}
	
	@BeforeMethod(description="before method annotation")
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}
		
	@Test(description="test method annotation")
	public void t() {
		System.out.println("test method");
	}	
	
	@AfterMethod(description="after method annotation")
	public void afterMethod() {
		System.out.println("in afterMethod");
	}
	
	@AfterTest(description="after test annotation")
	public void afterTest() {
		System.out.println("in afterTest");
	}
	
	@AfterSuite(description="after suite annotation")
	public void afterSuite() {
		System.out.println("in after suite");
	}

}