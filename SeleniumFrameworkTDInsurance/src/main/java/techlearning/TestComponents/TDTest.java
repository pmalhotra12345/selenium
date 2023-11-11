package techlearning.TestComponents;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import techlearning.pageobjects.AutoInsuranceQuote;
import techlearning.pageobjects.LandingPage;
@Listeners(techlearning.resources.Listeners.class)  

public class TDTest extends BaseTest{
	
	LandingPage landingPage;
	AutoInsuranceQuote autoInsuranceQuote;
	
//	ProductCatalogue productCatalogue = new ProductCatalogue (driver);
//	OrderPage ordersPage = new OrderPage(driver);

	@Test(dataProvider="getData")
	public void rbcTest(HashMap<String,String> input) throws IOException, InterruptedException

	{
		
			LandingPage landingPage = new LandingPage(driver);
			
			
			landingPage.goTo();
			
			landingPage.clickGetCarQuote();
			
			autoInsuranceQuote=new AutoInsuranceQuote(driver);
			
			autoInsuranceQuote.selectVehicleYear("2018");	
			autoInsuranceQuote.selectVehicleMake("HONDA");;
			autoInsuranceQuote.selectVehicleModel("ACCORD EX-L HYBRID 4DR");
			autoInsuranceQuote.clickNextBtn();
			
			autoInsuranceQuote.clickVehicleCondition("new");
			autoInsuranceQuote.clickOwnedOrLeased("leased");
			autoInsuranceQuote.selectPurchaseYear("2018");
			autoInsuranceQuote.selectPurchaseMonth("7");
			autoInsuranceQuote.clickNextBtn();
			
			autoInsuranceQuote.selectKilometers("5500");
			autoInsuranceQuote.clickCarUsedforWorkOrSchool("Yes");
			autoInsuranceQuote.selectOneWayDrivingDistance("17");
			autoInsuranceQuote.clickCarUsedForBusiness("No");
			autoInsuranceQuote.clickNextBtn();
			
			autoInsuranceQuote.coverageStartDate("2023", "10", "14");
			autoInsuranceQuote.clickNextBtn();
			
			autoInsuranceQuote.ifVehicleEqippedWithWinterTires("Yes");
			autoInsuranceQuote.ifEqippedWithAntiTheftTrackingSystem("No");
			autoInsuranceQuote.ifEqippedWithAntiTheftTrackingSystemWithin30Days("No");
			autoInsuranceQuote.enrollInTDMyAdvantageSavings("No");
			autoInsuranceQuote.clickNextBtn();
			
			autoInsuranceQuote.selectOrganization("none");
			autoInsuranceQuote.clickNextBtn();
	}
	
	
	@DataProvider (name="getData")
	public Object[][] getData() throws IOException
	{
		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\main\\java\\techlearning\\DataReader\\test1.json");
		return new Object[][]  {{data.get(0)}};
		
	}
	
	//Extent Reports - 

	/*
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
	
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//techlearning//data//PurchaseOrder.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	}
	
	
*/
	

	 	

}


