package techlearning.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techlearning.AbstractComponents.BasePage;

public class LineOfCredit extends BasePage{

	
	WebDriver driver;

	public LineOfCredit(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath = "//a[text()='Select your goal']")
	WebElement SelectYourGoal;
	
	public void selectYourGoal()
	{
		SelectYourGoal.click();
	}
	
	
	
	
	
}
