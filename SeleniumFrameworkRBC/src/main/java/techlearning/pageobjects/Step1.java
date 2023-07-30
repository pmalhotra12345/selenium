package techlearning.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techlearning.AbstractComponents.BasePage;


public class Step1 extends BasePage {
	WebDriver driver;

	@FindBy(xpath = "//*[@class='disc-list']//a[text()='Affordability Calculator']")
	WebElement clickafford;


	public Step1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickAffordability() {
		scroll();
//		WebElement el = driver.findElement(By.xpath("//*[@class='disc-list']//a[text()='Affordability Calculator']"));
//		el.click();
		
		clickafford.click();

	}


}
