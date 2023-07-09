package intermediate;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.*;

public class TooltipDemo { 
public static void main(String[] args) { 

String baseUrl = "https://jqueryui.com/tooltip/"; 
System.setProperty("webdriver.chrome.driver","<path of browser driver file>"); 
WebDriver driver = new ChromeDriver(); 
driver.get(baseUrl); 
String expectedTooltip = "We ask for your age only for statistical purposes."; 

// Find the age field 
WebElement ele = driver.findElement(By.id("age"));; 

//get the value of the "title" attribute 
String actualTooltip = ele.getAttribute("title"); 

//Comparing tooltip’s value with expected value 
System.out.println("Actual Title of Tool Tip"+actualTooltip); 
if(actualTooltip.equals(expectedTooltip)) { 
System.out.println("Test Case Passed"); 
} 
driver.close(); 
} 
}