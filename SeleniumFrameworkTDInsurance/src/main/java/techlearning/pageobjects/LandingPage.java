package techlearning.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techlearning.AbstractComponents.BasePage;

public class LandingPage extends BasePage{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	//PageFactory
	
	@FindBy(xpath="//*[@id=\"product-descSlider--1162864393-item1\"]/div/div/div/div/div/div[2]/div[3]/div/a")
	WebElement getCarQuote;
	
	
	public void clickGetCarQuote()
	{
		getCarQuote.click();
	}

	public void goTo()
	{
		driver.get("https://www.tdinsurance.com/products-services/auto-car-insurance/coverage/ontario?cm_sp=:GOOGLE:Ontario+-+Competitor+-+English+(23_S_IN_ING_AO_ACQ_ENFR):TDI:Sonnet+Car:auto+insurance+sonnet%C2%A0&&&gclid=CjwKCAjwseSoBhBXEiwA9iZtxmJ5KlyFVBeQuziKHN9NunOKY08Q9ioa2-P7jsDMOZjYafvoPTHseBoCTdMQAvD_BwE&gclsrc=aw.ds");
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
