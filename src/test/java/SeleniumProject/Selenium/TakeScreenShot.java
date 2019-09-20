package SeleniumProject.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("https://in.ebay.com/");
	     
	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // Now you can do whatever you need to do with it, for example copy somewhere
	     FileUtils.copyFile(scrFile, new File("./ScreenShots/screenshot.png"));

	}

}
