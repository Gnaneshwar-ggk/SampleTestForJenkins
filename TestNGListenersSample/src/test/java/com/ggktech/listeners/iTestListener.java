package com.ggktech.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class iTestListener implements ITestListener{

	public void onFinish(ITestContext result) {
		System.out.println("Listener: onFinish method executed :"+result.getName());
	}

	public void onStart(ITestContext result) {
		System.out.println("Listener: onStart method executed:"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Listener: Test Failed with percentage :"+result.getMethod().getConstructorOrMethod().getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listener: Test Failed: "+result.getName());
		System.out.println(result.getThrowable().getMessage());
		System.out.println(result.getThrowable().getMessage());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener: Test Skipped: "+result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Listener: Test Execution Started :"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener: Test Passed :"+result.getName());
		Reporter.log("Listener: Test Passed :"+result.getName());
	}

}
