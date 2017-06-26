package com.ggktech.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({com.ggktech.listeners.iTestListener.class})
public class sample {
	@Test
	public void sampletest(){
		System.out.println("Sample test");
		//Assert.assertEquals("Pasgfdh", "page");
		
	}
	
	@Test
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }
}
