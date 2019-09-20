package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		//Launch  the chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the url
		driver.get("https://classic.crmpro.com/register/");
		
		//Validating the title
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, "CRMPRO - CRM Pro for customer relationship management, sales, and support");

		//Select a value from the dropdown
		Select edition=new Select(driver.findElement(By.id("payment_plan_id")));
		edition.selectByVisibleText("Free Edition");
		
		driver.findElement(By.name("first_name")).sendKeys("John");
		
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Jose");
		
		driver.findElement(By.cssSelector("#multipleForm > div:nth-child(6) > input")).sendKeys("test@gmail.com");
		
		
		/*There are eight locators in selenium. We can prioritise the locators as below:
	 		1.id
			2.cssSelector
			3.xpath
			4.name
			5.className
			6.linkText
			7.partialLinkText
			8.tagName

			Xpath are of two types
			Absolute XPath
			Eg: html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/b

			Relative XPath
			Eg: //*[@class='featured-box']//*[text()='Testing']

			Absolute xpath should not be used,only Relative Xpath should be used */

		
	}

}
