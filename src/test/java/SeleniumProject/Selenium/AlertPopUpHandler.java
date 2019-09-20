package SeleniumProject.Selenium;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandler {

	public static void main(String[] args) {

	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       //Alert or popup handling
       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Alert alertbox=driver.switchTo().alert();
       
       String alertMessage=alertbox.getText();
       System.out.println(alertMessage);
       Assert.assertEquals("Please enter a valid user name", alertMessage);
       driver.switchTo().alert().accept();
       
      

	}

}
