package testNGFW;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class ActionsClass {
@Test
public void textInCaps() throws InterruptedException{
    //Instantiating the WebDriver interface.
	String driverExecutablePath = "C:\\DRIVERS\\chromedriver.exe";   
	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
	WebDriver driver = new ChromeDriver();
	
	//Open the required URL
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	//To maximize the browser
	driver.manage().window().maximize();
	//Create an object 'action' of an Actions class
	Actions action = new Actions(driver);
	By locator = By.cssSelector(".context-menu-one");
	//Wait for the element. Used Explicit wait
	// WebDriverWait wait = new WebDriverWait(driver, 5);
	//   wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement rightClickElement=driver.findElement(locator);
	//contextClick() method to do right click on the element
	action.contextClick(rightClickElement).build().perform();
	WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
	//getText() method to get the text value
	String GetText = getCopyText.getText();
	//To print the value
	System.out.println(GetText);
	//To close the browser
	driver.close();
}

@Test
public void doubleClick() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Environment\\Drivers\\chromedriver.exe");
		String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";   
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
	    //Open the required URL where you could do double click action
		driver.get("http://api.jquery.com/dblclick/");
	    //Maximize the browser
	    driver.manage().window().maximize();
	    //As per the above URL we need to switch to frame. The targeted element is in the frame
	    driver.switchTo().frame(0);
	    //Create the object 'action'
	    Actions action = new Actions(driver);
		//Find the targeted element
		WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
		//Here I used JavascriptExecutor interface to scroll down to the targeted element
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
		//used doubleClick(element) method to do double click action
		action.doubleClick(ele).build().perform();
		//Once clicked on the element, the color of element is changed to yellow color from blue color
		driver.close();
}

@Test
public void actionsClass() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		                //Create an object 'action'
		Actions action = new Actions(driver);
		                //navigate to the required url where we could do drag and drop action
		driver.get("http://jqueryui.com/droppable/");
		                //WebdriverWait is used to wait for a frame to be available. Once it is availble we switch to the frame to achieve our task
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		                //To get source locator
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
		                //To get target locator
		WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
		                //dragAndDrop(source, target) method accepts two parameters source and locator.
		                //used dragAndDrop method to drag and drop the source locator to target locator
		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
        }
}