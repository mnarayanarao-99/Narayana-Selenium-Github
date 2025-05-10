package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
  @Test
  public void f() throws Exception {
	// webdriver object
			WebDriver driver;
			
			// open Chrome Browser
			driver = new ChromeDriver();
			
			//maximize window
			driver.manage().window().maximize();
			
			//get alerts url
			driver.get("https://demoqa.com/alerts");
			
			Thread.sleep(3000);
			
			//find web element click me 1st element
			driver.findElement(By.id("alertButton")).click();		
			Thread.sleep(3000);
			
			//click on OK button from 1st click me alert box
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
  }
}
