package testNGFW;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@Test(groups={"Smoke"})
	public void ploan1()
	{
		System.out.println("good1");
	}
	
	@Test(groups={"Smoke"})
	public void ploasn2()
	{
		System.out.println("good2");
	}
	
	@Test(groups={"Regression"})
	public void ploasn3()
	{
		System.out.println("good3");
	}
	
	@Test(groups={"Regression"})
	public void ploasn4()
	{
		System.out.println("good4");
	}
	
	@Test(groups={"Regression"})
	public void ploasn5()
	{
		System.out.println("good5");
	}
	
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
