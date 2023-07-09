package firstPackage;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SelIntroduction {



		public static void main(String[] args) {
		
				//Invoking Browser
				
				//Chrome - ChromeDriver exten->Methods close get
				
				//Firefox- FirefoxDriver ->methods close get
				
				// WebDriver  close  get
				
				//WebDriver methods + class methods
				
				// Chrome
				
				System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
//				
				
				//Firefox
//				//
//				System.setProperty("webdriver.gecko.driver", "/Users/gfgf/Documents/geckodriver");
//				
//				WebDriver driver1 = new FirefoxDriver();
				//
				////Microsoft Edge
				//
				//System.setProperty("webdriver.edge.driver", "/Users/gfgd/Documents/msedgedriver");
				//
				//WebDriver driver2 = new EdgeDriver();
				
				driver.get("https://www.google.com");
				
//				try {
//					Thread.sleep(5000);
//				}
//				catch (InterruptedException e )
//				{
//					e.getStackTrace();
//					System.out.println("I was using Thread.sleep and I failed in catch");
//				}
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				try {
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
				System.out.println(driver.getTitle());
				
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
				
				//driver.quit();
				
				
		
		}
		
		
		
		}
		
