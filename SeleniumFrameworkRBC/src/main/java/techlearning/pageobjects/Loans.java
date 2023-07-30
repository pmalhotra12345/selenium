package techlearning.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techlearning.AbstractComponents.BasePage;

public class Loans extends BasePage{

	
	WebDriver driver;

	public Loans(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath = "//a[text()='Loans Overview']")
	WebElement LoansOverview;
	
//	@FindBy(xpath = "//a[text()='Mortgage Payment Calculator']")
//	WebElement MortgagePC;
	
	@FindBy(xpath = "//a[text()='Mortgage Payment Calculator']")
	WebElement MortgagePaymentCalc;
	
	
	public void clickLoansOverview()
	{
		LoansOverview.click();
	}
	
	public void mortgagePaymentCalc()
	{
		MortgagePaymentCalc.click();
	}
	
//	public void clickmortgage() {
//		MortgagePC.click();
//	}
//	
	
}
