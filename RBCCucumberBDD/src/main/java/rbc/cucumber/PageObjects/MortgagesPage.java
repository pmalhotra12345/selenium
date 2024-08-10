package rbc.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import rbc.cucumber.AbstractComponents.AbstractComponent;

public class MortgagesPage extends AbstractComponent{

	public MortgagesPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@aria-controls='mm-mortgages']")
	WebElement Mortgages;
	
	@FindBy(xpath="//a[text()='Mortgage Payment Calculator']")
	WebElement MortgagePaymentCalculator;
	
	@FindBy(xpath="//div[@id='mm-mortgages']//li//a[text()='Home Value Estimator']")
	WebElement HomeValueEstimator;
	
	
	public void hoverOnMortgages() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Mortgages).build().perform();
	}
	
	public void clickSubMortgagesMenu(String submenuName) {
		if(submenuName.equalsIgnoreCase("Mortgage Payment Calculator")) {
			MortgagePaymentCalculator.click();
		}
		else if(submenuName.equalsIgnoreCase("Home Value Estimator")) {
			HomeValueEstimator.click();
		}
		
	}
	

}
