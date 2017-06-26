package com.ggktech.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransListener implements IAnnotationTransformer  {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		
		if ("checkAnnotationTransFormer".equals(testMethod.getName())) {
		      annotation.setInvocationCount(5);
		    }

		
	}
}
