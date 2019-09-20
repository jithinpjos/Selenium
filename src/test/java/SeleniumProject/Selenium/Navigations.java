package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     /*Difference between driver.get and navigate to
	       Both are used to launch url but driver.get is used to launch the url 
	       and driver.navugate().to is used to navigate to an another url*/
	     
	     driver.get("https://in.ebay.com/");
	     
	     driver.navigate().to("https://www.google.com");
	     
	     driver.navigate().back();
	     
	     driver.navigate().forward();
	     
	     driver.navigate().refresh();
	     
	     driver.close();
	     

	}

}
