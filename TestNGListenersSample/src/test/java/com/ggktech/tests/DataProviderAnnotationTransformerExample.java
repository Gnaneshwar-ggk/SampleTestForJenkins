package com.ggktech.tests;

import org.testng.annotations.Test;

public class DataProviderAnnotationTransformerExample {
	@Test(dataProvider="largeDataSet", dataProviderClass=DataProviderFactory.class)
	public void largeDataTest(String param) {
		System.out.println("@Test Method(largeDataTest) is executed, parameter is " + param + " threadId: "
				+ Thread.currentThread().getId());
	}
}
