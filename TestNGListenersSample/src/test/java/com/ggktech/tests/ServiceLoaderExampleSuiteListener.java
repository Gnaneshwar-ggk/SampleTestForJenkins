package com.ggktech.tests;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ServiceLoaderExampleSuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("on Start " + suite.getName());
	}

	public void onFinish(ISuite suite) {
		System.out.println("on finish " + suite.getName());		
	}
}