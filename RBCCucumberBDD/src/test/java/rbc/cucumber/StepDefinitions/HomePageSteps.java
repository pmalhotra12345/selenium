package rbc.cucumber.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

import rbc.cucumber.PageObjects.HomePage;

import rbc.cucumber.TestComponents.DriverManager;


public class HomePageSteps   {
	public HomePage homepage;
	private WebDriver driver = DriverManager.getDriver();
	String title;
	@Given("^I am on the RBC Home Page$")
	public void i_am_on_the_rbc_home_page() {
		//launchWebApp();
		homepage = new HomePage(driver);
		homepage.goTo();
		
	    
	}

	@Then("^The page title should be displayed$")
	public void the_page_title_should_be_displayed() {
	     title = homepage.getPageTitle();
	    Assert.assertFalse(title.isEmpty(), "Page Title should not be empty");
	    
	}


	@Then("^Verify the title has \"(.*)\" value$")
	public void verify_the_title_has_value(String ExpectedTitle) {
	   Assert.assertEquals(title,ExpectedTitle);
	}

	@When("^I enter the \"(.*)\" in the Search box$")
	public void i_enter_the_text_in_the_search_box(String search_txt) {
	    homepage.sendTxt(search_txt);
	}

	@And("^I click the search button$")
	public void i_click_the_search_button() {
	    homepage.clickAskBtn();
	}

	@Then("^I should see the search results page$")
	public void i_should_see_the_search_results() {
		//testingWait();
	    Assert.assertNotEquals(title, "Universal Search Public -  RBC Royal Bank");
	}
	
	
}
