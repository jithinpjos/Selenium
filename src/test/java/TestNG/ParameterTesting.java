package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {

	@Test
	@Parameters({"url","email"})
	public void LoginToYahoo(String url,String email)
	{
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get(url); 
	   driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(email);
	   driver.findElement(By.xpath("//input[@id='login-signin']")).submit();
	}
}
