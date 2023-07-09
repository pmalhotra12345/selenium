package basicSelenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	//2
public class NavigateCommands {
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aarav\\Downloads\\Tech Learning\\QA\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		// Open ToolsQA web site
		String appUrl = "https://www.google.com";
	//	String demoqa = "https://demoqa.com/";
			
		driver.get(appUrl);
	//	driver.get(demoqa);

		// Click on Registration link
	//	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
	}
}