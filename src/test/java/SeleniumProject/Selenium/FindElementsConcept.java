package SeleniumProject.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://in.ebay.com/");
	     
	     
	     //1.Find the total number of links in the website
	     //2.Print all the links in the console
	     
	    List <WebElement> linkList= driver.findElements(By.tagName("a"));
	    
	    //total number of links
	    System.out.println(linkList.size());
	    
	    //Print all the links in the console
	    
	    for(int i=0;i<linkList.size();i++) {
	    	String linkText=linkList.get(i).getText();
	    	System.out.println(linkText);
	    }
	     
        driver.close();
	}

}
