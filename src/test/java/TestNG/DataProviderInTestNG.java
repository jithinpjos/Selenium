package TestNG;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata=Utility_ReadExcel.getDataFromExcel();
		return testdata.iterator();
		
	}
	
	@Test(dataProvider="getTestData")
	public void register(String firstName,String lastName,String email)
	{
		
		Select edition=new Select(driver.findElement(By.id("payment_plan_id")));
		edition.selectByVisibleText("Free Edition");
		
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastName);
		
		driver.findElement(By.cssSelector("#multipleForm > div:nth-child(6) > input")).sendKeys(email);
	}
	

/*	@Test
	public void testing1() {
		Select edition=new Select(driver.findElement(By.id("payment_plan_id")));
		edition.selectByVisibleText("Free Edition");
		
		driver.findElement(By.name("first_name")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("test");
		
		driver.findElement(By.cssSelector("#multipleForm > div:nth-child(6) > input")).sendKeys("test");
	}
	*/
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
