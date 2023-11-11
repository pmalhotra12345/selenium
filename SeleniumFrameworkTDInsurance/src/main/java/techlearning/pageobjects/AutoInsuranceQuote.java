package techlearning.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import techlearning.AbstractComponents.BasePage;

public class AutoInsuranceQuote extends BasePage{

	
	WebDriver driver;

	public AutoInsuranceQuote(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(id = "quoterEngine.question.carYear.button")
	WebElement elementCarYear;
	
	@FindBy(id = "quoterEngine.question.carMake.button")
	WebElement elementCarMake;
	
	@FindBy(id = "quoterEngine.question.carModel.button")
	WebElement elementCarModel;
	
	@FindBy(id = "quoterEngine.footerButton.next")
	WebElement nextBtn;
	
	@FindBy(id = "quoterEngine.question.datePurchase.year")
	WebElement elementPurchaseYear;
	
	@FindBy(id = "quoterEngine.question.datePurchase.month")
	WebElement elementPurchaseMonth;
	
	@FindBy(id = "quoterEngine.question.effectiveDate.year")
	WebElement elementCoverageStartYear;
	
	@FindBy(id = "quoterEngine.question.effectiveDate.month")
	WebElement elementCoverageStartMonth;
	
	@FindBy(id = "quoterEngine.question.effectiveDate.day")
	WebElement elementCoverageStartDay;
	
	@FindBy(id = "radio-button-group-discount-not-applicable")
	WebElement elementNoOraganization;

	public void selectVehicleYear(String year)
	{
		waitForElementToAppear(elementCarYear);
		Select vehicleYear= new Select(elementCarYear);
		vehicleYear.selectByValue(year);
	}
	public void selectVehicleMake(String make) {
		scroll();
		waitForElementToAppear(elementCarMake);
		Select vehicleMake= new Select(elementCarMake);
		vehicleMake.selectByValue(make);
	}
	public void selectVehicleModel(String model) {
		waitForElementToAppear(elementCarModel);
		Select vehicleModel= new Select(elementCarModel);
		vehicleModel.selectByValue(model);
	}
	public void clickNextBtn() {
		waitForElementToAppear(nextBtn);
		nextBtn.click();
	}
	public void clickVehicleCondition(String condition)
	{
		condition=condition.toLowerCase();
		WebElement carCondition=driver.findElement(By.id("quoterEngine.question.carCondition."+condition));
		waitForElementToAppear(carCondition);
		carCondition.click();
	}
	public void clickOwnedOrLeased(String status)
	{
		status=status.toLowerCase();
		WebElement carOwnedOrLeased=driver.findElement(By.id("quoterEngine.question.ownedOrLeased."+status));
		waitForElementToAppear(carOwnedOrLeased);
		carOwnedOrLeased.click();
	}
	public void selectPurchaseYear(String year) {
		scroll();
		waitForElementToAppear(elementPurchaseYear);
		Select vehicleModel= new Select(elementPurchaseYear);
		vehicleModel.selectByValue(year);
	}
	public void selectPurchaseMonth(String month) {
		waitForElementToAppear(elementPurchaseMonth);
		Select vehicleModel= new Select(elementPurchaseMonth);
		vehicleModel.selectByValue(month);
	}
	public void selectKilometers(String kmValue) {
		int kmValueInInt=Integer.parseInt(kmValue);
		String num;
		WebElement elementKilometers;
		if(kmValueInInt>0 && kmValueInInt<=5000)
			num="0";
		else if(kmValueInInt>5000 && kmValueInInt<=10000)
			num="1";
		else if(kmValueInInt>10000 && kmValueInInt<=15000)
			num="2";	
		else if(kmValueInInt>15000 && kmValueInInt<=20000)
			num="3";
		else 
			num="4";
		
		elementKilometers=driver.findElement(By.id("radio-list-"+num));
		//waitForElementToAppear(elementKilometers);
		elementKilometers.click();		
	}
	public void clickCarUsedforWorkOrSchool(String answer) {
		WebElement ifCarUsedForWorkOrSchool;
		if(answer.equals("Yes"))
		{
			ifCarUsedForWorkOrSchool = driver.findElement(By.id("quoterEngine.question.vehicleUseCommute."+"true"));
		}
		else {
			ifCarUsedForWorkOrSchool = driver.findElement(By.id("quoterEngine.question.vehicleUseCommute."+"false"));
		}
		waitForElementToAppear(ifCarUsedForWorkOrSchool);
		ifCarUsedForWorkOrSchool.click();
	}
	public void selectOneWayDrivingDistance(String kmValue) {
		int kmValueInInt=Integer.parseInt(kmValue);
		String num;
		WebElement elementKilometers;
		if(kmValueInInt>1 && kmValueInInt<=5)
			num="0";
		else if(kmValueInInt>5 && kmValueInInt<=15)
			num="1";
		else if(kmValueInInt>15 && kmValueInInt<=30)
			num="2";
		else 
			num="3";
		
		elementKilometers=driver.findElement(By.xpath("//*[@id='quoterEngine.page.carUsage']/div[3]//input[@id='radio-list-"+num+"']"));
		elementKilometers.click();		
	}
	public void clickCarUsedForBusiness(String answer) {
		WebElement ifCarUsedForBusiness;
		if(answer.equals("Yes"))
		{
			ifCarUsedForBusiness = driver.findElement(By.id("quoterEngine.question.vehicleUseBusiness."+"true"));
		}
		else {
			ifCarUsedForBusiness = driver.findElement(By.id("quoterEngine.question.vehicleUseBusiness."+"false"));
		}
		waitForElementToAppear(ifCarUsedForBusiness);
		ifCarUsedForBusiness.click();
	}
	public void coverageStartDate(String year, String month, String day) {
		Select coverageStartYear, coverageStartMonth, coverageStartDay;
		waitForElementToAppear(elementCoverageStartYear);
		waitForElementToAppear(elementCoverageStartMonth);
		waitForElementToAppear(elementCoverageStartDay);
		
		coverageStartYear= new Select(elementCoverageStartYear);
		coverageStartYear.selectByValue(year);
		
		coverageStartMonth = new Select(elementCoverageStartMonth);
		coverageStartMonth.selectByValue(month);
		
		coverageStartDay = new Select(elementCoverageStartDay);
		coverageStartDay.selectByValue(day);
		
	}
	public void ifVehicleEqippedWithWinterTires(String answer) {
		WebElement elementIfVehicleEqippedWithWinterTires;
		if(answer.equals("Yes"))
		{
			elementIfVehicleEqippedWithWinterTires = driver.findElement(By.id("quoterEngine.question.winterTiresQuestion."+"true"));
		}
		else {
			elementIfVehicleEqippedWithWinterTires = driver.findElement(By.id("quoterEngine.question.winterTiresQuestion."+"false"));
		}
		waitForElementToAppear(elementIfVehicleEqippedWithWinterTires);
		elementIfVehicleEqippedWithWinterTires.click();
	}
	public void ifEqippedWithAntiTheftTrackingSystem(String answer) {
		WebElement elementIfEqippedWithAntiTheftTrackingSystem;
		if(answer.equals("Yes"))
		{
			elementIfEqippedWithAntiTheftTrackingSystem = driver.findElement(By.id("quoterEngine.question.antiTheftQuestion."+"true"));
		}
		else {
			elementIfEqippedWithAntiTheftTrackingSystem = driver.findElement(By.id("quoterEngine.question.antiTheftQuestion."+"false"));
		}
		waitForElementToAppear(elementIfEqippedWithAntiTheftTrackingSystem);
		elementIfEqippedWithAntiTheftTrackingSystem.click();
	}
	public void ifEqippedWithAntiTheftTrackingSystemWithin30Days(String answer) {
		WebElement elementIfEqippedWithAntiTheftTrackingSystemWithin30Days;
		if(answer.equals("Yes"))
		{
			elementIfEqippedWithAntiTheftTrackingSystemWithin30Days = driver.findElement(By.id("quoterEngine.question.antiTheft30DaysQuestion."+"true"));
		}
		else {
			elementIfEqippedWithAntiTheftTrackingSystemWithin30Days = driver.findElement(By.id("quoterEngine.question.antiTheft30DaysQuestion."+"false"));
		}
		waitForElementToAppear(elementIfEqippedWithAntiTheftTrackingSystemWithin30Days);
		elementIfEqippedWithAntiTheftTrackingSystemWithin30Days.click();
	}
	public void enrollInTDMyAdvantageSavings(String answer) {
		WebElement elementEnrollInTDMyAdvantageSavings;
		if(answer.equals("Yes"))
		{
			elementEnrollInTDMyAdvantageSavings = driver.findElement(By.id("quoterEngine.question.ubiDiscount."+"true"));
		}
		else {
			elementEnrollInTDMyAdvantageSavings = driver.findElement(By.id("quoterEngine.question.ubiDiscount."+"false"));
		}
		waitForElementToAppear(elementEnrollInTDMyAdvantageSavings);
		elementEnrollInTDMyAdvantageSavings.click();
	}
	public void selectOrganization(String type) {
		waitForElementToAppear(elementNoOraganization);
		if(type.equals("none"))
		{
			elementNoOraganization.click();
		}
	}
}
