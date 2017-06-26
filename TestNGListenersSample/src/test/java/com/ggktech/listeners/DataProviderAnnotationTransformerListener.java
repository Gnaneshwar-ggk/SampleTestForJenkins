package com.ggktech.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class DataProviderAnnotationTransformerListener implements IAnnotationTransformer2 {
	public void transform(ITestAnnotation paramITestAnnotation,
			Class paramClass, Constructor paramConstructor, Method paramMethod) {
	}


	public void transform(
			IConfigurationAnnotation paramIConfigurationAnnotation,
			Class paramClass, Constructor paramConstructor, Method paramMethod) {	
	}


	public void transform(IDataProviderAnnotation paramIDataProviderAnnotation,
			Method paramMethod) {
		if (paramIDataProviderAnnotation.getName().equals("largeDataSet")) {
			System.out.println("Large data set, run parallely");
			paramIDataProviderAnnotation.setParallel(true);
		}
		
	}

	public void transform(IFactoryAnnotation paramIFactoryAnnotation,
			Method paramMethod) {	
	}
}