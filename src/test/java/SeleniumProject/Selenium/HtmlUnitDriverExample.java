package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverExample {

	public static void main(String[] args) {
		
		//htmlUnitDriver is not available in selenium 3.x version
		//htmlunitdriver--to use this concept,we have to download htmlunitdriver jar file
		
		//advantages
		//1.testing is happening behind the scene--no browser is launched
		//2.Very fast--execution of test cases--very fast--performance of the script
		//3.not suitable for Action class--user actions--mousemovement,doubleclick,drag and drop
		//4.Ghost Driver--Headless Browser:
		//--Html Unit Driver--Java
		//--PhantomJS--JavaScript
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		System.out.println("Title of Login Page "+driver.getTitle());
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	       driver.findElement(By.xpath("//input[@value='Login']")).submit();
	       
	       System.out.println("Title of home page "+driver.getTitle());
	       
	       driver.close();
	}

}
