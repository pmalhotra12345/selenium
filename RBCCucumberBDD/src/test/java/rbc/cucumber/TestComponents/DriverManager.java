package rbc.cucumber.TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver initializeDriver() {
    System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
        driverThreadLocal.set(driver);
        return driver;
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }
    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }
    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }
}


