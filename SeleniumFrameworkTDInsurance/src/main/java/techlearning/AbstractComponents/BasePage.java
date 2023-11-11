package techlearning.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	
	WebDriver driver;

	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void waitForElementToAppear(WebElement findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findBy));

	}
	
	public void waitForElementToAppearthread(WebElement findBy) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void scroll() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,350)", "");
	}
	
	
	 public void click(By by) {
	      WebElement element = waitForElementToBeClickable(by);
	      element.click();
	    }
	 
//	 public void click(WebElement we) {
//	      WebElement element = waitForElementToBeClickable(we);
//	      element.click();
//	    }


	 public void sendKeys(By by, String text) {
	      WebElement element = waitForElementToBeClickable(by);
	      element.sendKeys(text);
	    }

	  public WebElement waitForElementToBeClickable(By by) {
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
	       return element;
	    }

	    public boolean isElementPresent(By by) {
	        return driver.findElements(by).size() > 0;
	    }

}
