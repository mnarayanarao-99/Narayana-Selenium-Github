package sel.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		//user name  & password
		driver.findElement(By.name("username")).sendKeys("saadwik");
        driver.findElement(By.id("password")).sendKeys("password1");
        
        //click login button
        driver.findElement(By.name("login")).click();
	}

}
