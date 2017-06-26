package com.ggktech.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReporterListenerExample {
	private int i;
	@Test()
	public void test1() {
		System.out.println("in test1");
	}

	@Test(expectedExceptions=RuntimeException.class)
	public void test2() {
		System.out.println("in test2");
	}

	@Test(dependsOnMethods={"test2"})
	public void test3() {
		System.out.println("in test3");
	}	
}