package testNGFW;

import java.io.IOException;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Upload_Oct8 {
public static void main(String[] args) throws IOException, InterruptedException {
//Instantiation of driver object. To launch Firefox browser
	 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//To open URL "http://softwaretestingmaterial.com"
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		Thread.sleep(5000);
		//pass the path of the file to be uploaded using Sendkeys method
		browse.sendKeys("C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Exercises");
				
		//'close' method is used to close the browser window
		//driver.close();
}
}