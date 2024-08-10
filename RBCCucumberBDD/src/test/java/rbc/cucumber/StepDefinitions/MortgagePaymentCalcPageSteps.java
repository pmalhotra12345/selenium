package rbc.cucumber.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import rbc.cucumber.PageObjects.HomePage;
import rbc.cucumber.PageObjects.MortgagePaymentCalculatorPage;
import rbc.cucumber.PageObjects.MortgagesPage;

import rbc.cucumber.TestComponents.DriverManager;

public class MortgagePaymentCalcPageSteps{
	
	public HomePage homepage;
	
	public MortgagesPage mortgagespage;
	public MortgagePaymentCalculatorPage mpcpage;
	private WebDriver driver = DriverManager.getDriver();
	@Given("^I am on Mortgage Payment Calculator$")
	public void i_am_on_mortgage_payment_calculator() {
		//launchWebApp();
		homepage = new HomePage(driver);
		homepage.goTo();
		mortgagespage = new MortgagesPage(driver);
		mortgagespage.hoverOnMortgages();
		mortgagespage.clickSubMortgagesMenu("Mortgage Payment Calculator");
		
	}

	@When("^I entered Mortgage Amount \"(.*)\" in text box$")
	public void i_entered_mortgage_amount_in_text_box(String MortgageAmount) {
	   mpcpage = new MortgagePaymentCalculatorPage(driver);
	   mpcpage.fillMortgageAmt(MortgageAmount);
	}

	@When("Click the calculate button")
	public void click_the_calculate_button() {
		mpcpage.clickBtn("calculate");
	    
	}
	@Then("Calculated Value should be visible")
	public void calculated_value_should_be_visible() {
		//testingWait();
	   boolean result = mpcpage.resultVisible();
	   Assert.assertEquals(true, result);
	}

	

}
