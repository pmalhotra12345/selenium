package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementById {

     public static void main(String[] args) {
		
//    		String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";    	
//      		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
//    	 
    	 
    	 
    	 
    	WebDriverManager.chromedriver().setup();
    	
    	
    	//Open chrome browser
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demoqa.com/text-box/");	
		
				
	    WebElement element = driver.findElement(By.id("submit"));
				
				
		if(element != null) {
			    System.out.println("Element found by ID");
	}
   }
}
