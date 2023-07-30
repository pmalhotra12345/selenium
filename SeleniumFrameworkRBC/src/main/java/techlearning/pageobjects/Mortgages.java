package techlearning.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techlearning.AbstractComponents.BasePage;

public class Mortgages extends BasePage{

	
	WebDriver driver;

	public Mortgages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath = "//a[text()='Buy Your First Home']")
	WebElement BuyFHome;
	
	@FindBy(xpath = "//a[text()='Mortgage Payment Calculator']")
	WebElement MortgagePC;
	
//	@FindBy(xpath = "//a[text()='Mortgage Payment Calculator']")
//	WebElement MortgagePaymentCalc;
	
	
	public void clickBuyFHome()
	{
		BuyFHome.click();
	}
	
//	public void mortgagePaymentCalc()
//	{
//		MortgagePaymentCalc.click();
//	}
	
	public void clickmortgage() {
		MortgagePC.click();
	}
	
	
}
