package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementById2 {

     public static void main(String[] args) {
		
    	//	String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";    	
      	//	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
    	 
    	 
    	 int x= 6;
    	 
    	WebDriverManager.chromedriver().setup();
    	
    	
    	
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demoqa.com/text-box/");	
		
		WebElement el = driver.findElement(By.id("userName"));	
		
		
		el.sendKeys("Kirti Tripathi");
		
				
//	    WebElement element = driver.findElement(By.id("submit"));
//				
//				
//		if(element != null) {
//			    System.out.println("Element found by ID");
//		}
		
		
   }
}
