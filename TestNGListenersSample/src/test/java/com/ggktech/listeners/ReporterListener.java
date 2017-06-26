package com.ggktech.listeners;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class ReporterListener implements IReporter {
	public void generateReport(List<XmlSuite> xmlSuites,
			List<ISuite> suites, String outputDirectory) {
		System.out.println("*****Custom Report******");
		for (ISuite suite : suites) {
            String suiteName = suite.getName();
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()){
            	ITestContext tc = sr.getTestContext();
            	System.out.println("Passed tests for suite '" + suiteName +"' is:" + tc.getPassedTests().getAllResults().size());
            	System.out.println("Failed tests for suite '" + suiteName +"' is:" + tc.getFailedTests().getAllResults().size());
            	System.out.println("Skipped tests for suite '" + suiteName +"' is:" + tc.getSkippedTests().getAllResults().size());
	      }
        }
		System.out.println("*****End of Report******");
	}
}