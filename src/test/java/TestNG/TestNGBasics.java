package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
	 
	 TestNG-Unit Test Framework
	 TestNG is used for TDD
	 
	 Purpose-design test cases in a systematic order
	 -html reports
	 -Different annotations
	 -Priorities/Sequences 
	 -dependency
	 -grouping
	 -data provider
	 
	 testNG-openSource
	 
	 Step 1 Is install TestNG in eclipse
	 
	 http://beust.com/eclipse/
	 
	 
	 Sequences :
	 	@BeforeSuite-Set syatem properties
		@BeforeTest--Launch Browser
		@BeforeClass-Open the browser
		
		@BeforeMethod-Login to the application
		@Test--Check the Image of the page
		@AfterMethod--Logout from the application
		
		@BeforeMethod-Login to the application
		@Test--Check the title of the page
		@AfterMethod--Logout from the application
		
		@AfterClass-Close the browser
		@AfterTest---Write to report 
	 
	 */
	
	
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite-Set syatem properties");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch Browser");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("@BeforeClass-Open the browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod-Login to the application");
	}
	
	@Test
	public void b_googleTitleTest() {
		System.out.println("@Test--Check the title of the page");
	}
	
	@Test
	public void a_googleImageTest() {
		System.out.println("@Test--Check the Image of the page");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod--Logout from the application");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass-Close the browser");
	}
	
	@AfterTest
	public void writeToReport() {
		System.out.println("@AfterTest---Write to report");
	}
	
	@AfterSuite
	public void closeReport() {
		System.out.println("@AfterSuite--Close the report");
	}
	
	

}
