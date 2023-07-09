package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands2 {
	
	public static void click(WebDriver driver, WebElement element2) {
//		(
//		new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
//		
		driver.findElement ((By) element2).click();
		
	}
	
public static void main(String[] args) {
		
		String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver 
		WebDriver driver = new ChromeDriver(); 
		
		// Storing the Application Url in the String variable 
		String url = "https://www.facebook.com/"; 
		
		//Launch the ToolsQA WebSite 
		driver.get(url); 
		
		//Maximize browser window
		 driver.manage().window().maximize();
		 
		//Clear
		WebElement element = driver.findElement(By.id("email"));
		element.clear();

		//Or can be written as

		driver.findElement(By.id("email")).clear();
		
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys("techlearning@gmail.com");

		//Or can be written as
		//Send Keys
		driver.findElement(By.id("email")).sendKeys("techlearning@gmail.com");
		
		WebElement element2 = driver.findElement(By.linkText("ToolsQA"));
	//	element2.click();
		click(driver, element2);

		//Or can be written as
		//Click
		driver.findElement(By.linkText("ToolsQA")).click();
			
	
}

}
