package com.ggktech.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({com.ggktech.listeners.iTestListener.class})
public class TestListenerExample {
  private WebDriver driver;
  private int i=0;
  @BeforeMethod
  public void setup(){
	  	System.out.println("@Before Method is called");
	  	//String exePath = "E:\\WS_GGK\\TestNGListenersSample\\src\\main\\Data\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		/*driver = new ChromeDriver();
		driver.manage().window().maximize();  */
		
  }
  @Test
  public void launchGooglePage() {
	  System.out.println("@Test Method is called");
	  //driver.navigate().to("https://www.google.com/");
	  System.out.println("Google page launhced");
	 
  }
  
  /*@Test(successPercentage=60,invocationCount=5)
  public void test2(){
	  i++;
	  System.out.println("@Test2 Method is called");
	  if(i==1||i==2){
		  System.out.println("test2 failed!");
          Assert.assertEquals(i, 8);
	  }
	 
  }*/
  
  @Test()
  public void test3(){
	  System.out.println("@Test Method is called");
	  //driver.navigate().to("https://www.google.com/");
	  Assert.assertEquals("Pasgfdh", "page");
  }
  
  @Test
  public void test4(String p){
	  System.out.println("t3 test method will skip as parameter p is not set");
  }
  
  
  @AfterMethod
  public void tearDown(){
	  System.out.println("@After Method is called");
	  driver.close();
  }
  
}
