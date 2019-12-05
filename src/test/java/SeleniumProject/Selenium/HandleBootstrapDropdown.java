package SeleniumProject.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Example 1
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().contains("Angular"))
			{
				lst.get(i).click();
			}
		}
		
		//Example 2
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']")).click();
		
		List<WebElement> list =driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed']//div//span"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("‪Italiano"))
			{
				list.get(i).click();
			}
		}

	}

}
