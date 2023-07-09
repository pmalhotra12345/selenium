package testngpackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	
	@AfterSuite	
	public void afSuite()
	{
		System.out.println("I am in after suite ");
	}
	
	
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	
	@BeforeSuite	
	public void bfSuite()
	{
		System.out.println("I am in Before Suite");
	}
	
//	@AfterSuite	
//	public void afSuite()
//	{
//		System.out.println("I am in after suite ");
//	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void ThirdTest()
	{
		System.out.println("Test2");
	}
	
//	@BeforeMethod
//	public void beforeevery()
//	{
//		System.out.println(" I will execute before every test method, I am beforemethod");
//	}
//	
//	@AfterMethod
//	public void afterevery()
//	{
//		System.out.println(" I will execute after  every test method in day 3 class,I am aftermethod");
//	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before executing all methods in the class, I am beforeclass");
	}
	
	@AfterClass
	public void afteclas()
	{
		System.out.println("After executing all methods in the class, I am afterclass");
	}
	
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last. I am Aftertest");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I will execute first in before Test, I am beforetest");
		
	}
	
	// Runninmg a test
	//Before Suite	
				//Before Test
						//Before Class
								//Before method
													//Test
								//After method
						//After Class
				//After Test	
	//After Suite
	
	
	//When there are 2 Tests
	
	//Before Suite
	
	//BeforeTest	
	//BeforeClass
	
	//Beforemethod	
	//Test1
	//aftermethod
	
	//beforemethod
	//Test2
	//aftermethod
	
	//AfterClass
	//AfterTest	
	//AfterSuite


}
