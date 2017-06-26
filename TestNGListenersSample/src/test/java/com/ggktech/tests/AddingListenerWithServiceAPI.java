package com.ggktech.tests;

import org.testng.TestNG;

import com.ggktech.listeners.iTestListener;

public class AddingListenerWithServiceAPI {
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.setTestClasses(new Class[] {VerifyListenerWithServiceAPI.class});
		testNG.addListener(new iTestListener());
		testNG.run();
		}
}
