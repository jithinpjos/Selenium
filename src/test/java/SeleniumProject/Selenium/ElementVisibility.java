package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {

/*
1. isDisplayed() is the method used to verify the presence of a web element within the web page. 
	The method returns a “true” value if the specified web element is present on the web page and 
	a “false” value if the web element is not present on the webpage.
2. isDisplayed() is capable to check for the presence of all kinds of web elements available.
3. isEnabled() is the method used to verify if the web element is enabled or disabled within the web page.
4. isEnabled() is primarily used with buttons.
5. isSelected() is the method used to verify if the web element is selected or not. 
6. isSelected() method is predominantly used with radio buttons, dropdowns and checkboxes.
 */

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://classic.crmpro.com/register/");
	    
	    boolean b1=driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).isDisplayed();
	    System.out.println(b1);//true
	    
	    boolean b2=driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).isEnabled();
	    System.out.println(b2);//false
	    
	    driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	    
	    boolean b3=driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).isEnabled();
	    System.out.println(b3);//true
	    
	    boolean b4=driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
	    System.out.println(b4);//true
	       
	    driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	    
	    boolean b5=driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
	    System.out.println(b5);//false
	    
		
	}

}
