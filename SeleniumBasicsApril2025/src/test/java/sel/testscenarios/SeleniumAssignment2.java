package sel.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2 {

	public static void main(String[] args) {
		// driver object
		WebDriver driver;
		
		//get CHROME Browser
		driver = new ChromeDriver();
		
		//MAXIMIZE window
		driver.manage().window().maximize();
		
		// get URL		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		//find web elements email, password
		driver.findElement(By.name("email")).sendKeys("saadwik@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("saadwik@12345");
		
		// click Register button 
		driver.findElement(By.name("register")).click();
		

	}

}
