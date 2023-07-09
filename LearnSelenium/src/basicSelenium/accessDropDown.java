package basicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class accessDropDown {
 public static void main(String[] args) throws InterruptedException { 
	 
//		String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";
//	   	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
	   	
	   	WebDriverManager.chromedriver().setup();
	   	
	   	String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	
	    WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		
		Thread.sleep(2000);		

		Select drpCountry = new Select(driver.findElement(By.name("country")));
	//	drpCountry.selectByIndex(0);
		
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(2000);

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		
		//By Link Text
		
		String baseUrl1 = "http://demo.guru99.com/test/link.html";
		driver.get(baseUrl1);					
	    driver.findElement(By.linkText("click here")).click();					
	    System.out.println("title of page is: " + driver.getTitle());		
	    
	    //By partial link text	
      		
        driver.get("http://demo.guru99.com/test/accessing-link.html");					
        driver.findElement(By.partialLinkText("here")).click();					
        System.out.println("Title of page is: " + driver.getTitle());	       
     	    
	    driver.quit();
 }
}