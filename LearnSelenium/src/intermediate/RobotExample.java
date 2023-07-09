package intermediate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotExample {

    public static void main(String[] args) throws AWTException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

        // Initialize the WebDriver (e.g., Chrome)
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://www.example.com");

        // Create a Robot instance
        Robot robot = new Robot();

        // Simulate pressing the Enter key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Simulate a mouse click
        int x = 100; // X-coordinate of the click position
        int y = 200; // Y-coordinate of the click position
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // Close the WebDriver
        driver.quit();
    }
}