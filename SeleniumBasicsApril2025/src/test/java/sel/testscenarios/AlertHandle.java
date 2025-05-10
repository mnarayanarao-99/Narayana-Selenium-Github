package sel.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
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
		
		//get alert box text and display on console
		System.out.println(driver.switchTo().alert().getText());
		
		//click on OK button from 1st click me alert box
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Click on 3rd Click me button (if button comes below we have to use java script scroll view logic 
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("args[0].scrollIntoView();)",driver.findElement(By.id("confirmButton")));
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		
		//click on cancel button
		driver.switchTo().alert().dismiss();
		

	}

}
