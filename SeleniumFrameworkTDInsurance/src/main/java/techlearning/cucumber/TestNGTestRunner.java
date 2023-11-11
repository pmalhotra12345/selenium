package techlearning.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


import org.junit.runner.RunWith;


@CucumberOptions(
features = "src/test/Feature"
,glue={"src/main/stepDefinition"}
)

public class TestNGTestRunner {
}