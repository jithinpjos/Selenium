package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       //upload a file
	       
	       driver.get("https://html.com/input-type-file/");
	       //Type=file should be available for using this browse option
	       driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("D:\\Offensive Security\\Screenshots\\20190206\\1.PNG");

	}

}
