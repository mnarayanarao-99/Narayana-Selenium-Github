package sel.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment5 {

	public static void main(String[] args) {
		
		// driver object
		WebDriver driver;
		
		//open browser
		driver = new ChromeDriver();
		
		//max window
		driver.manage().window().maximize();
		
		// open URL
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// type first name and email in edit boxes
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Boris");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Becker");
		
		// click on gender button
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		
		// check on hobbies check boxes
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		// submit button
		driver.findElement(By.id("submitbtn")).click();

	}

}
