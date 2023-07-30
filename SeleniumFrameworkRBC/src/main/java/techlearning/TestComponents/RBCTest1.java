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
import techlearning.pageobjects.LandingPage;
import techlearning.pageobjects.MAC;
import techlearning.pageobjects.Mortgages;
import techlearning.pageobjects.Step1;
@Listeners(techlearning.resources.Listeners.class)  

public class RBCTest1 extends BaseTest{
	
	LandingPage landingPage;
	Mortgages mortgages;
	Step1 step;
	MAC mac;
	
//	ProductCatalogue productCatalogue = new ProductCatalogue (driver);
//	OrderPage ordersPage = new OrderPage(driver);

	@Test(dataProvider="getData")
	public void rbcTest(HashMap<String,String> input) throws IOException, InterruptedException

	{
		
			LandingPage landingPage = new LandingPage(driver);
			
			
			landingPage.goTo();
			
			landingPage.hoverMortgages();
			
			mortgages = new Mortgages(driver);
			
			mortgages.clickBuyFHome();
			
			step = new Step1(driver);
			
			step.clickAffordability();
			
			mac = new MAC(driver);
			
			mac.inputincome(input.get("income"));
			mac.inputexpense(input.get("loan"));
			mac.inputcc(input.get("credit"));
			mac.inputcreditline(input.get("line"));
			mac.inputotherdebt(input.get("debt"));
			mac.inputdp(input.get("down"));	
	
		
		
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


