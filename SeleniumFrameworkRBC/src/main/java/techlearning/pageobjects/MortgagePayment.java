package techlearning.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import techlearning.AbstractComponents.BasePage;


public class MortgagePayment extends BasePage {
	WebDriver driver;

	@FindBy(xpath = "//a[@id='top-page-tab-2']")
	WebElement advance;

	@FindBy(xpath = "//div[@class='tab-pane active']//input[@id='basicMortAmount']")
	WebElement amt;
	
	@FindBy(name = "amortizationYears")
	WebElement amortY;
	
	@FindBy(name = "amortizationMonths")
	WebElement amortM;
	
	@FindBy(name = "paymentFrequency")
	WebElement PaymentF;
	
	@FindBy(name = "rateYears")
	WebElement rateY;
	
	@FindBy(name = "rateMonths")
	WebElement rateM;
	
	@FindBy(xpath = "//div[@class='tab-pane active']//button[text()='Calculate']")
	WebElement click;

	public MortgagePayment(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	public void clickadvance() {
		advance.click();
	}
	
	


	public void inputelement(String amount) {
		
		amt.sendKeys(amount);
		
		Select aY = new Select(amortY);
		aY.selectByVisibleText("20 Years");
		
		Select aM = new Select(amortM);
		aM.selectByVisibleText("6 Months");
		
		Select payFreq = new Select(PaymentF);
		payFreq.selectByVisibleText("Monthly");
		
		Select interestYear = new Select(rateY);
		interestYear.selectByVisibleText("3 Years");
		
		Select interestMonth = new Select(rateM);
		interestMonth.selectByVisibleText("6 Months");
	}
	
	public void clickcalculate() {
		click.click();
	}

}
