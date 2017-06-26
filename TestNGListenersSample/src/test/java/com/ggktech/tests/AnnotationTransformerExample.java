package com.ggktech.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AnnotationTransformerExample {
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
  public void checkAnnotationTransFormer() {
	  System.out.println("@First Test Method is called");
	  driver.navigate().to("https://www.google.com/");	  
  }
  
  @Test
  public void testCasetwo(){
	  System.out.println("@Second Test Method is called");
	  driver.navigate().to("http://testng.org/doc/");  
  }
 
  @AfterMethod
  public void tearDown(){
	System.out.println("@After Method is called");  
	driver.quit();  
  } 
}
