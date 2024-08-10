package rbc.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import rbc.cucumber.AbstractComponents.AbstractComponent;



public class HomeValueEstimatorPage extends AbstractComponent {

	public HomeValueEstimatorPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="address")
	WebElement homeAddress;
	
	@FindBy(xpath="//button[contains(text(),'Get Started')]")
	WebElement continueBtn1;
	
	//Radio Button
	@FindBy(xpath="//label[@for='detached']")
	WebElement detachedHouse;
	
	@FindBy(xpath="//label[@for='semidetached']")
	WebElement semidetachedHouse;
	
	@FindBy(xpath="//label[@for='townhouse']")
	WebElement townHouse;
	
	@FindBy(xpath="//label[@for='condo']")
	WebElement condoOrApartment;
	
	@FindBy(xpath="//div[@class='controls-box desktop-controls-box']/div[2]/button")
	WebElement continueBtn2;
	
	@FindBy(id="price")
	WebElement purchasePrice;
	
	@FindBy(id="month")
	WebElement MonthofBuy;
	
	@FindBy(id="year")
	WebElement YearofBuy;
	
	@FindBy(xpath="//*[@id=\"dvl-wpr\"]/main/section/div/div[2]/div[3]/div[3]/div[1]/div[2]/button[1]")
	WebElement continueBtn3;
	
	@FindBy(xpath="//label[@for='no-renovate']")
	WebElement noRenovate;
	
	@FindBy(xpath="//form[@name='renovatingForm']//div[@class='controls-box desktop-controls-box']/div[2]/button")
	WebElement continueBtn4;
	
	public void btnClick(String btnName) {
		if(btnName.equals("GetStarted")) {
			continueBtn1.click();
		}
		if(btnName.equals("Continue")) {
			continueBtn2.click();
		}
		if(btnName.equals("ContinueNext")) {
			continueBtn3.click();
		}
		if(btnName.equals("ContinueNextRenovate")) {
			continueBtn4.click();
		}
		
	}
	
	public WebElement inputData(String inputElementName) {
		WebElement sendValElement = null;
		if(inputElementName.equals("Address")) {
			sendValElement = homeAddress;
		}
		else if(inputElementName.equals("PurchasePrice")) {
			sendValElement = purchasePrice;
		}
		else if(inputElementName.equals("Month")) {
			sendValElement = MonthofBuy;
		}
		else if(inputElementName.equals("Year")) {
			sendValElement = YearofBuy;
		}
		return sendValElement;
	}
	
	public void sendValToElement(String inputElementName,String inputValue) {
		WebElement element;
		if(!inputElementName.isEmpty()) {
			element = inputData(inputElementName);
			element.sendKeys(inputValue);
		}
		
	}
	
	public void selectValueByText(String elementName,String selectText) {
		WebElement element = inputData(elementName);
		
		Select select = new Select(element);
		select.selectByVisibleText(selectText);
	}
	
	
	public void selectPropertyType(String propertyType) {
		WebElement selectPropertyType=null;
		if(propertyType.equals("DetachedHouse")){
			selectPropertyType=detachedHouse;
		}
		else if(propertyType.equals("SemiDetachedHouse")){
			selectPropertyType=semidetachedHouse;
		}
		else if(propertyType.equals("TownHouse")){
			selectPropertyType=townHouse;
		}
		else if(propertyType.equals("CondoOrApartment")){
			selectPropertyType=condoOrApartment;
		}
		
		
		if(!selectPropertyType.isSelected()) {
			System.out.println("Comes Here");
			selectPropertyType.click();
		}
		
	}
	public void renovateYesNo(String selOption) {
		if(selOption.equals("No")) {
			noRenovate.click();
		}
	}
	
	

}
