package rbc.cucumber.StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import rbc.cucumber.TestComponents.DriverManager;

public class Hooks {
	@Before
    public void setUp() {
        // Initialize the driver and set it in the driver manager
        WebDriver driver = DriverManager.initializeDriver();
        DriverManager.setDriver(driver);
    }

    @After
    public void tearDown() {
        // Quit the driver
        DriverManager.quitDriver();
    }
}
