package intermediate;

import java.io.IOException;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
public class AutoITExample {				
public static void main(String[] args) throws IOException, InterruptedException {								
 //   WebDriver driver=new FirefoxDriver();		
	
	  System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\107\\chromedriver.exe");
      
      // Initialize browser
      WebDriver driver=new ChromeDriver();
      
    driver.get("http://demo.guru99.com/test/autoit.html");			
 //   driver.findElement(By.id("postjob")).click();			

//    driver.findElement(By.id("input_3")).sendKeys("Gaurav");                                 					
//    driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");	
    Thread.sleep(5);
    driver.findElement(By.id("input_5")).click();			
    // below line execute the AutoIT script .
     Runtime.getRuntime().exec("C:\\DRIVERS\\AutoIT\\FileUpload.exe");		
//    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
//    driver.findElement(By.id("input_2")).click();
//    driver.close();
     }
}