package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePageTest {
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
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title of the page is "+title);
	}
	
	@Test
	public void googleImageTest() {
		boolean image=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Image is displayed "+image);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
