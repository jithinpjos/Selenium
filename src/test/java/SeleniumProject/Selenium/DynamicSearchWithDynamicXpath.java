package SeleniumProject.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearchWithDynamicXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbl1']"));
		
		
		System.out.println(lst.size());
	
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().contains("java tutorial"))
			{
				lst.get(i).click();
				break;
			}
		}
		
		

	}

}
