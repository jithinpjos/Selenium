package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsInTestNG {
	/*
	 Groups In index.html
	 
	  	Image Test
			googleImageTest
		
		Test
			test1
			test2
			test3
			test4
			test5
		
		Title Test
			googleTitleTest
	 
	 */

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=6,groups="Title Test")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title of the page is "+title);
	}
	
	@Test(priority=4,groups="Image Test")
	public void googleImageTest() {
		boolean image=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Image is displayed "+image);
	}
	
	@Test(priority=2,groups="Test")
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1,groups="Test")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=3,groups="Test")
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=7,groups="Test")
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(priority=5,groups="Test")
	public void test5() {
		System.out.println("Test 5");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
