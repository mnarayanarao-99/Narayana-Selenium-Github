package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class FB_Login_New {
	
	// define object for Locators class
	   Locators loc = new Locators();
	
  @Test
  public void f() throws Exception {
	  
	   // Properties file data
	  //Property file path
	 //  FileInputStream fi = new FileInputStream(".src\\test\\resources\\testdata\\QA_Environment.properties");
	   FileInputStream fi = new FileInputStream("C:\\Users\\mnara\\eclipse-workspace\\HybridFramework_Narayana\\src\\test\\resources\\testdata\\QA_Environment.properties");
	    
	  // create OBJECT for PROPERTIES class from  PREDEFINED JAVA CLASS
	    Properties prop = new Properties();
	    prop.load(fi);
	  
	  
	  // source code here
	  WebDriver driver;
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();	     
	     //driver.get("https://www.facebook.com/");
	     driver.get(prop.getProperty("FB_URL"));
	     Thread.sleep(2000);
	     
	     driver.findElement(loc.fbLogin_ForgotPassword_Link).click();
	     Thread.sleep(2000);
	     
	  //   driver.findElement(By.name("email")).sendKeys("fdfdfdfdfd");
	     
	     driver.findElement(loc.fbLogin_Email_editbox).sendKeys(prop.getProperty("FB_UN"));
  }
}
