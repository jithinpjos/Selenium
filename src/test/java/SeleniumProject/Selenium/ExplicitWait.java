package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.get("https://in.ebay.com/");
	     
	     //PageLoadTimeout-Will wait for 30 seconds to load the page completely.
	     //If it load in 2 seconds,execution will continue after 2 seconds
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     
	   //implicitlywait-Will wait for 30 seconds to load the page completely.
	  //If it load in 2 seconds,execution will continue after 2 seconds
	 //(Declare once and applicable in all elements-slow down the script)(Global wait-applicable for all elements)
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     Thread.sleep(1000);//Static wait
	     
	     
	     //Explicit wait
	     
	     clickOn(driver,driver.findElement(By.xpath("//input[@type='submit']")),20);
	   
	}
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
