package com.ggktech.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class ConfigurationAnnotationTransformerListener implements IAnnotationTransformer2{
	public void transform(IConfigurationAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		System.out.println("Configure annotation " + annotation.getDescription());
	}
	
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {		
	}

	public void transform(IDataProviderAnnotation annotation, Method method) {
	}	

	public void transform(IFactoryAnnotation annotation, Method method) {
	}

	
}
