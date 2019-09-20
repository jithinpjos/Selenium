package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class MouseMovement {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("https://www.spicejet.com");
	     
  
         Actions action=new Actions(driver);
	     
	     action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
	     
	     action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
	     
	     driver.findElement(By.linkText("FAQ")).click();

	}

}
