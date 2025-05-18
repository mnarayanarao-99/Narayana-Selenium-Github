package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Login {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.linkText("Forgot paasword?")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("email")).sendKeys("fdfdfdfdfd");
  }
}
