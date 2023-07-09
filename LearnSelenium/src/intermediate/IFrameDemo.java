package intermediate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrameDemo {
        public static void main(String[] args){
                //set the location of chrome browser from the local machine path
                System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\107\\chromedriver.exe");
                
                // Initialize browser
                WebDriver driver=new ChromeDriver();
                
                //navigate to url
                driver.get("https://demoqa.com/frames");
                
                driver.manage().window().maximize();
                
                //Locate the frame1 heading
                
                driver.switchTo().frame("frame1"); 
                
                WebElement x= driver.findElement(By.id("sampleHeading"));
                
                //Finding the text of the frame1 heading
                String frame1Text=x.getText();
                
                //Print the heading
                System.out.println("Text of the frame1 heading is:"+frame1Text);
                
                //switch to default frame
                driver.switchTo().defaultContent();
                
                //closing the driver
                driver.close();
        }
}