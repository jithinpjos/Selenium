package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://classic.crmpro.com/");
		
		System.out.println("Title of Login Page "+driver.getTitle());
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	       driver.findElement(By.xpath("//input[@value='Login']")).submit();
	       
	       System.out.println("Title of home page "+driver.getTitle());
	       
	       driver.close();

	}

}
