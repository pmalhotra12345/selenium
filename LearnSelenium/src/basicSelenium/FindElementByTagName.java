package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementByTagName {
   public static void main(String[] args) {
	   
//	   String driverExecutablePath = "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe";
//	   System.setProperty("webdriver.chrome.driver", driverExecutablePath);
	   
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();

	   driver.get("https://demoqa.com/text-box/");
		
	   // Find elements using tag name
	   //Example of ArrayList
	   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		
	   if(allInputElements.size() != 0) 
	   {
		   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
			
		   for(WebElement inputElement : allInputElements) 
		   {
			   System.out.println(inputElement.getAttribute("placeholder"));
		   }
	   }
   }
}