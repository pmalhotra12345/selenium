package techlearning.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import techlearning.AbstractComponents.BasePage;

public class MAC extends BasePage {

	WebDriver driver;

	public MAC(WebDriver driver) {
		// initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "income")
	WebElement incm;
	
	@FindBy(id = "total_debt")
	WebElement expense ;
	
	@FindBy(id = "car_loan")
	WebElement loans;
	
	@FindBy(id = "cc")
	WebElement creditcard;
	
	@FindBy(id = "loc")
	WebElement creditline;
	
	@FindBy(id = "other")
	WebElement otherdebt;
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement cont;
	
	@FindBy(id = "dp")
	WebElement downpay;

	

	
	public void inputincome(String income)
	{
		waitForElementToAppear(incm);
		incm.sendKeys(income);
	}
	
	public void inputexpense(String loan){
	
		//waitForElementToAppear(expense);
		expense.click();
		
		waitForElementToAppear(loans);
		loans.sendKeys(loan);	
	}
	
	public void inputcc(String credit) {
		//waitForElementToAppear(creditcard);
		//loans.click();
		creditcard.sendKeys(credit);
	}
	
	public void inputcreditline(String line) {
		waitForElementToAppear(creditline);
		creditline.sendKeys(line);
	}
	
	public void inputotherdebt(String debt) {
		waitForElementToAppear(otherdebt);
		otherdebt.sendKeys(debt);
		waitForElementToAppear(cont);
		cont.click();
	}
	
	
	public void inputdp(String down) {
		waitForElementToAppear(downpay);
		downpay.sendKeys(down);
	}
	
	
	
	
	

}
