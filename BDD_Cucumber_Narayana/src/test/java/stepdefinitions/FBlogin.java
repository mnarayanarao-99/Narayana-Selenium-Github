package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBlogin {
	WebDriver driver;
	
	@Given ("Open FB URL on any browser")
	public void openAnyBrowser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.fb.com");
	   
	}

	@When("User type invalid UN and PSWD")
	public void user_type_invalid_un_and_pswd() {
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("afdfdfdfdfsdfdf");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("fjhfjdshfsdh");
	    
	   
	}

	@And("Click on Login button")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
	    
	    	}

	@Then("Check error message has displayed or not")
	public void check_error_message_has_displayed_or_not() 
	{
	   if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0)
	        {
		   System.out.println("Error message is present on screen, *** given credentials are invalid ***");
		   //results =
		    }
	   
	   else {
		   System.out.println("Error text not present on screen==> given credentials are valid");
	        }
	   
	}


	
}
