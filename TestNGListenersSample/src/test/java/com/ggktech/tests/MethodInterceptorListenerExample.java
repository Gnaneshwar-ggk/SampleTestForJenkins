package com.ggktech.tests;

import org.testng.annotations.Test;

public class MethodInterceptorListenerExample {
	@Test(groups="perf")
	public void t1() {
		System.out.println("test method: t1");
	}
	
	@Test
	public void t2() {
		System.out.println("test method: t2");
	}
}
