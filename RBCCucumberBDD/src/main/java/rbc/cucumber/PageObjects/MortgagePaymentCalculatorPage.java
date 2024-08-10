package rbc.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import rbc.cucumber.AbstractComponents.AbstractComponent;


public class MortgagePaymentCalculatorPage extends AbstractComponent {

	public MortgagePaymentCalculatorPage(WebDriver driver) {
		super(driver);
		
	}
	// Simple Calculator
	@FindBy(xpath="//form[@name='CalculateBasic']//input")
	WebElement mortgageAmtSimple;
	
	@FindBy(xpath="//form[@name='CalculateBasic']//button")
	WebElement calculateBtn;
	
	// Advance Calculator
	@FindBy(id="top-page-tab-2")
	WebElement tabAdvance;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//input[@id='basicMortAmount']")
	WebElement mortgageAmtAdvanced;
	//Select
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='amortizationYears']")
	WebElement amortizationYears;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='amortizationMonths']")
	WebElement amortizationMonths;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='paymentFrequency']")
	WebElement paymentFrequency;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//input[@id='interestRatePercent']")
	WebElement interestRate;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='rateType']")
	WebElement interestType;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='rateYears']")
	WebElement interestTermYears;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//select[@id='rateMonths']")
	WebElement interestTermMonths;
	
	@FindBy(xpath="//form[@name='CalculateAdvanced']//button[text()='Calculate']")
	WebElement calculateAdvanceBtn;
	
	@FindBy(id="results-1")
	WebElement results;
	
	public boolean resultVisible() {
		waitForElement(results);
		boolean resultVisible = false;
		
		if(results.isDisplayed()) {
			resultVisible = true;
		}
		else {
			resultVisible = false;
		}
		return resultVisible;
	}
	public void fillMortgageAmt(String MortgageAmt) {
		mortgageAmtSimple.sendKeys(MortgageAmt);
	}
	public void clickBtn(String btnName) {
		if(btnName.equals("calculate")) {
			calculateBtn.click();
		}
		if(btnName.equals("AdvanceTab")) {
			waitForElement(tabAdvance);
			tabAdvance.click();
		}
		if(btnName.equals("CalculateAdvance")) {
			calculateAdvanceBtn.click();
		}
		
	}
	
	public WebElement selectElement(String elementName) {
		WebElement selectElement = null;
		
		if(elementName.equals("AmortizationPeriodYears")) {
			selectElement = amortizationYears;
		}
		if(elementName.equals("AmortizationPeriodMonths")) {
			selectElement = amortizationMonths;
		}
		if(elementName.equals("PaymentFrequency")) {
			selectElement =paymentFrequency;
		}	
		if(elementName.equals("InterestType")) {
			selectElement =interestType;
		}
		if(elementName.equals("InterestTermYears")) {
			selectElement = interestTermYears;
		}
		if(elementName.equals("InterestTermMonths")) {
			selectElement = interestTermMonths;
		}						
										
		return selectElement;
	}
	
	public void selectByText(String elementName,String inputText) {
		WebElement element = null;
		
		if(!elementName.isEmpty()) {
			element = selectElement(elementName);
		}
		waitForElement(element);
		Select select = new Select(element);
		select.selectByVisibleText(inputText);
	}
	
	public void inputVal(String elementName, String inputText) {
		if(elementName.equals("MortgageAmount")) {
			waitForElement(mortgageAmtAdvanced);
			mortgageAmtAdvanced.sendKeys(inputText);
		}
		if(elementName.equals("InterestRate")) {
			waitForElement(interestRate);
			interestRate.clear();
			interestRate.sendKeys(inputText);
		}
		
	}
	
	
	

}
