package testNGFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGPriority {
	WebDriver driver = new ChromeDriver();

	@Test (priority = 1)
	public void CloseBrowser() {
		driver.close();
		System.out.println("Closing Google Chrome browser");
	}

	@Test (priority = 0)
	public void OpenBrowser() {
		driver.get("https://www.demoqa.com");
		System.out.println("Launching Google Chrome browser"); 
	}

	@Test (priority = 2)
	public void AccountTest(){
		System.out.println("Some tests for Customer Account");
	}
}
