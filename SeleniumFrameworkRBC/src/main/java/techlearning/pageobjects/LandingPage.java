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
	
	@FindBy(xpath="//a[@aria-controls='mm-mortgages']")
	WebElement mortgage;
	
	
	
	
	public void hoverMortgages() {
		Actions ac = new Actions(driver);
		
		WebElement mortgage = driver.findElement(By.xpath("//*[@id=\"dvl-wpr\"]/header/div[4]/nav/ul/li[3]/a"));
		
		
		ac.moveToElement(mortgage).build().perform();
	}
	
	public void hoverLoans() {
//		Actions ac = new Actions(driver);
//		
//		WebElement mortgage = driver.findElement(By.xpath("//*[@id=\"dvl-wpr\"]/header/div[4]/nav/ul/li[3]/a"));
//		
//		
//		ac.moveToElement(mortgage).build().perform();
	}
	
	public void goTo()
	{
		driver.get("https://www.rbcroyalbank.com/personal.html");
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
