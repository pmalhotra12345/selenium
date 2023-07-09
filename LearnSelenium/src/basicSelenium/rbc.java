package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class rbc {

			public static void main(String[] args) throws InterruptedException{
			//Setting the driver path
		//	System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
			
			//Creating WebDriver instance
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//Chromedriver is a class that implements methods of webdriver.
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//Navigate to web page
			// driver.get("www.facebook.com");
			driver.get("https://www.rbcroyalbank.com/personal.html");
			
			//Maximizing window
			driver.manage().window().maximize();
			// Find element using locator and store into WebElement
			//*[@id="dvl-wpr"]/header/div[4]/nav/ul/li[3]/a
			
			WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"dvl-wpr\"]/header/div[4]/nav/ul/li[3]/a"));
			
			// Find element using locator and store into WebElement
			WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"mm-mortgages\"]/div/div/div[2]/ul/li[1]/a"));
			
			// Create object of Action class
			Actions action = new Actions(driver);
			
			// Perform moveToElement operation using action (object) on element.
			action.moveToElement(elementToHover).click(elementToClick).build().perform();
			
			// affordability calculator
			WebElement afford = driver.findElement(By.xpath("//*[text() = 'Affordability Calculator']"));
			// Click
			action.click(afford);
			
			WebElement income = driver.findElement(By.cssSelector("input[id='income']"));
			income.sendKeys("100000");
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[id='income']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='total_debt']")));
			
						
			// Expenses Now
			WebElement expen = driver.findElement(By.xpath("//input[@id='total_debt']"));
			expen.click();
			
		//	try {
			
			
			// expenses input
			
//			WebElement loan = driver.findElement(By.xpath("////input[@id='car_loan']"));
//			WebElement cc = driver.findElement(By.xpath("////input[@id='cc']"));
//			WebElement loc = driver.findElement(By.xpath("////input[@id='loc']"));
//			WebElement other = driver.findElement(By.xpath("////input[@id='other']"));
			
			WebElement loan = driver.findElement(By.xpath("//input[@id='car_loan']"));
			WebElement cc = driver.findElement(By.xpath("//input[@id='cc']"));
			WebElement loc = driver.findElement(By.xpath("//input[@id='loc']"));
			WebElement other = driver.findElement(By.xpath("//input[@id='other']"));
			
			loan.sendKeys("1000");
			cc.sendKeys("100");
			loc.sendKeys("2000");
			other.sendKeys("200");
			
		//	WebElement cont = driver.findElement(By.cssSelector("//*[text()='Continue']"));
			WebElement cont = driver.findElement(By.xpath("//*[text()='Continue']"));
			cont.click();
			
			
			// DownPayment
			
			WebElement dp = driver.findElement(By.xpath("//input[@id='dp']"));
			dp.click();
			dp.sendKeys("100000");			
				
		//	driver.quit();
						
			
}

}
