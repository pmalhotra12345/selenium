package rbc.cucumber.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import rbc.cucumber.PageObjects.HomePage;
import rbc.cucumber.PageObjects.MortgagePaymentCalculatorPage;
import rbc.cucumber.PageObjects.MortgagesPage;

import rbc.cucumber.TestComponents.DriverManager;

public class MortgagePaymentCalcAdvancedPageSteps{
	
	public HomePage homepage;

	public MortgagesPage mortgagespage;
	public MortgagePaymentCalculatorPage mpcpage;
	private WebDriver driver = DriverManager.getDriver();

	@Given("^I am on Mortgage Payment Calculator page$")
	public void i_am_on_mortgage_payment_calculator() {
		// launchWebApp();
		homepage = new HomePage(driver);
		homepage.goTo();
		mortgagespage = new MortgagesPage(driver);
		mortgagespage.hoverOnMortgages();
		mortgagespage.clickSubMortgagesMenu("Mortgage Payment Calculator");

	}

	@Given("^I am on Advanced Mortgage Payment Calculator$")
	public void i_am_on_advanced_mortgage_payment_calculator() {
		mpcpage = new MortgagePaymentCalculatorPage(driver);
		mpcpage.clickBtn("AdvanceTab");
		// mpcpage.testingWait();

	}

	@When("^I entered  Mortgage Amount \"(.*)\" in text box$")
	public void i_entered_mortgage_amount_in_text_box(String mortgage_amt) {
		mpcpage.inputVal("MortgageAmount", mortgage_amt);
		// mpcpage.testingWait();
	}

	@And("^Select the Amortization Period Years \"(.*)\" and Months \"(.*)\"$")
	public void select_the_amortization_period_years_and_months(String am_years, String am_months) {
		mpcpage.selectByText("AmortizationPeriodYears", am_years);
		mpcpage.selectByText("AmortizationPeriodMonths", am_months);
		// mpcpage.testingWait();
	}

	@And("^Select the Payment Frequency \"(.*)\"$")
	public void select_the_payment_frequency(String payment_frequency) {
		mpcpage.selectByText("PaymentFrequency", payment_frequency);
		// mpcpage.testingWait();
	}

	@And("^Enter the Interest Rate \"(.*)\" in text box$")
	public void enter_the_interest_rate_in_text_box(String interest_rate) {
		mpcpage.inputVal("InterestRate", interest_rate);
		// mpcpage.testingWait();
	}

	@And("^Select the Interest Type \"(.*)\"$")
	public void select_the_interest_type(String interest_type) {
		mpcpage.selectByText("InterestType", interest_type);
		// mpcpage.testingWait();
	}

	@And("^Select the Interest Term Years \"(.*)\" and Months \"(.*)\"$")
	public void select_the_interest_term_years_and_months(String interest_years, String interest_months) {
		mpcpage.selectByText("InterestTermYears", interest_years);
		mpcpage.selectByText("InterestTermMonths", interest_months);
		// mpcpage.testingWait();
	}

	@And("^Click the Advance calculate button$")
	public void Click_the_Advance_calculate_button() {
		mpcpage.clickBtn("CalculateAdvance");
	}

	@Then("^Advanced Calculated Value should be visible$")
	public void calculated_value_should_be_visible() {
		boolean result = mpcpage.resultVisible();
		Assert.assertEquals(true, result);
		mpcpage.testingWait();
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
