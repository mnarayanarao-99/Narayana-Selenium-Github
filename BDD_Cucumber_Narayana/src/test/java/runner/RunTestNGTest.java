package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//C:\Users\mnara\eclipse-workspace\BDD_Cucumber_Narayana\src\test\resources\Features\fb.feature
		features = ".\\src\\test\\resources\\Features\\fb.feature",
		glue = "stepdefinitions",
		// after executing the runner file, default report will be available in test-output==>emailable-report.html
		// right click open explorer will see the testng teport.
		//if you want to see more detailed report , add below 2 steps==> but will work on firefox browser only 
		// will be created in target folder as cucumber-reports
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
public class RunTestNGTest extends AbstractTestNGCucumberTests {
	
}
