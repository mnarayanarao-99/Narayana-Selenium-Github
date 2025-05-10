package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationalDemoMethodsDemo {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(2000);
	  
	 driver.findElement(By.linkText("Forgot password?")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("email")).sendKeys("addfdfdf");
	 
	 //Refresh the page
	 driver.navigate().refresh();
	 
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
  }
}
