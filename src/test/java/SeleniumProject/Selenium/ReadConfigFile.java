package SeleniumProject.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {


		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("./src/test/java/SeleniumProject/Selenium/Config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("searchvalue"));
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.get(prop.getProperty("url"));
		

	}

}
