package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class TS_07_Subscription_email_Rao extends CommonFunctions {
	
	// define object for Locators class
	   Locators loc = new Locators();
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	//Property file path
	   FileInputStream fi = new FileInputStream("C:\\Users\\mnara\\eclipse-workspace\\HybridFramework_Narayana\\src\\test\\resources\\testdata\\QA_Environment.properties");
	  
	// create OBJECT for PROPERTIES class from  PREDEFINED JAVA CLASS
	   Properties prop = new Properties();
	   prop.load(fi);
	    
	// Chrome Driver
	   WebDriver driver;
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	    
	// get URL Automation exercise products
	   driver.get(prop.getProperty("AUTO_EX_URL"));
	   Thread.sleep(2000);
	  
	// the subscriptiob button is not with in view so scrollable view code is required
	    
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("args[0].scrollIntoView();)",driver.findElement(loc.automation_Subscription_editbox));  
	   
	 //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	  // wait.until(ExpectedConditions.elementToBeClickable(By.id("subscribe_email")));
	   
	   //WebElement element = driver.findElement(By.id("subscribe_email"));
	   
	   //js.executeScript("args[0].scrollIntoView();)",driver.findElement(By.id("subscribe_email"))); 
	   //js.executeScript("args[0].scrollIntoView();)",element);
	   
	  //1. do not enter any data in the text box and click ==> display error message / capture screen shot
	    // driver.findElement(loc.automation_Subscription_submit_button).click();
	    // Thread.sleep(2000);
	  //2. enter some invalid data in the text box and click ==> display email with @ / capture screen shot
	  //3. enter valid email id in the text box and click ==> display subscription success
  }
}
