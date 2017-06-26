package com.ggktech.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class VerifyListenerWithServiceAPI {
	 private WebDriver driver;
	  
	  @BeforeMethod
	  public void setup(){
		  	System.out.println("@Before Method is called");
		  	String exePath = "E:\\WS_GGK\\TestNGListenersSample\\src\\main\\Data\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();  
			
	  }
	  
	  @Test
	  public void launchGooglePage() {
		  System.out.println("@Test Method is called");
		  driver.navigate().to("https://www.google.com/");
		  System.out.println("Google page launhced");
		 
	  }
	  
	  @Test
	  public void checkPageTitle(){
		  System.out.println("@Test Method is called");
		  driver.navigate().to("https://www.google.com/");
		  Assert.assertEquals(driver.getTitle(), "page");
	  }
	 
	  @AfterMethod
	  public void tearDown(){
		  System.out.println("@After Method is called");
		  driver.close();
	  }
}
