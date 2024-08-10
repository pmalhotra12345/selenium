package rbc.cucumber.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/java/rbc/cucumber/Features/", 
		glue = { "rbc.cucumber.StepDefinitions" },
		plugin = { "pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				 },
			
		// tags=("@smoketag or @regressiontag"),
		// tags=("@smoketag and @regressiontag"),
		//tags="@smoke",
		monochrome = true, 
		dryRun = false)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
//*******Report will be stored in target/cucumber-report-new/cucumber.html ********//
//*******Hooks file for executing steps before and after each scenario. We can set order for hooks********//
