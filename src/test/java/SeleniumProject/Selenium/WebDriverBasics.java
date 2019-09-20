package SeleniumProject.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//First we need to set the property of the browser using System.setProperty as below
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//We need to create the object of the driver as below:
		WebDriver driver=new ChromeDriver();
		
		//Here WebDriver is the Interface in Selenium and ChromeDriver is an existing class.

	}

}
