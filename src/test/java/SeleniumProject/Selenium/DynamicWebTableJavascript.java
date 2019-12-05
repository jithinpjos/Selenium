package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableJavascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		enterValueUsingjs(driver,driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")),"21-10-2019");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")).click();
		
	}
	
	public static void enterValueUsingjs(WebDriver driver,WebElement element,String dateVal)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}

}
