package basicSelenium;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;		


public class LinkText {
	
	public static void main(String[] args) {								
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");		
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        String theLinkText = driver.findElement(By
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By				
                .partialLinkText("EGIS"))			
                .getText();		
        System.out.println(theLinkText);					

        driver.quit();			

    }

}
