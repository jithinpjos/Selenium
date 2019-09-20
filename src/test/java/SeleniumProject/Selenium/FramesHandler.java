package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandler {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://classic.crmpro.com/");
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	       driver.findElement(By.xpath("//input[@value='Login']")).submit();
	       
	       driver.switchTo().frame("mainpanel");
	       
	       driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	       
	       driver.switchTo().parentFrame();

	}

}
