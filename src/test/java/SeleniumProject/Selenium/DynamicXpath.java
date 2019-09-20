package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://in.ebay.com/");
	     /*
	        Xpath are of two types
			Absolute XPath
			Eg: html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/b
			
			1.Performance issue
			2.not reliable
			3.Can be changed at any time in future

			Relative XPath
			Eg: //*[@class='featured-box']//*[text()='Testing']

			Absolute xpath should not be used,only Relative Xpath should be used */
	      
	     
		
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Keys");
		 
		 driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Keys");
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Home')]")).sendKeys("Keys");
		 
		 driver.findElement(By.xpath("//a[starts-with(text(),'Computers')]")).sendKeys("Keys");
		 
		 driver.findElement(By.xpath("//button[ends-with(@id,'-a')]")).click(); //Not support in the current chrome version(xml version 1.0)(only from xml version 2.0)
		 
		

	}

}
