package testNGFW;

import org.testng.annotations.Test;

public class DependenyAnnot2 {
	
	@Test
	public void OpeningBrowser()
	{
	//This opens the Browser
	System.out.println("Executing opening Browser");

	}
	
	@Test(dependsOnMethods={"OpeningBrowser"},alwaysRun=true )
	public void FlightBooking()
	{
		System.out.println("Executing Flightbooking");
	}
	
	@Test(timeOut=45000)
	public void Timerelated()
	{
	//This opens the Browser
	System.out.println("New Testcase");
	
	}

	@Test(enabled=false)
	public void Payment()
	{
	//This opens the Browser
	System.out.println("New Testcase");
	
	}

}


//
//@BeforeTest
//Launch Browser
//Open URL
//
//@BeforeMethod
//Print I am starting a test
//
//@AfterMethod
//Print I am starting a test
//

//
//@Test
//Click Buy your first Home
//
//@Test
//Click on affordability calc
//
//@Test
//Fill in all details
//
//@Test 
//Validate the calculations

//@Test
//Hovering Mortgages

//
//@AfterTest
//Close browser

