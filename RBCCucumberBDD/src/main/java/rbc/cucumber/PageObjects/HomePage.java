package rbc.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rbc.cucumber.AbstractComponents.AbstractComponent;


public class HomePage extends AbstractComponent{
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="intelli-search")
	WebElement searchBox;
	
	@FindBy(id="ask-button")
	WebElement askBtn;
	
	public void goTo() {
		driver.get("https://www.rbcroyalbank.com/personal.html");
	}
	
	public void sendTxt(String search_txt) {
		searchBox.sendKeys(search_txt);
	}
	
	public void clickAskBtn() {
		askBtn.click();
	}

	public String getPageTitle() {
		String Title = driver.getTitle();
		return Title;
	}
	
	public String getUrl() {
		String current_url = driver.getCurrentUrl();
		return current_url;
	}

	

}
