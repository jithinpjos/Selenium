package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityInTestNG {
	
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
	
	/*
	 Executed Order:
	PASSED: test2
	PASSED: test1
	PASSED: test3
	PASSED: googleImageTest
	PASSED: test5
	PASSED: googleTitleTest
	PASSED: test4
	 
	 */
	
	@Test(priority=6)
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title of the page is "+title);
	}
	
	@Test(priority=4)
	public void googleImageTest() {
		boolean image=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Image is displayed "+image);
	}
	
	@Test(priority=2)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=7)
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(priority=5)
	public void test5() {
		System.out.println("Test 5");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
