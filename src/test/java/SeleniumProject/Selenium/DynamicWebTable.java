package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
/*
 There are two ways of handling WebTable:

Method – 1:
• Iterate row and column and get the cell value.
• Using for loop
• Get total rows and iterate table
• Put if(string matches) then select the respective checkbox
• Lengthy method

Method – 2:
• Using custom XPath
• Using parent and preceding-sibling tags
• No need to write for loop
• No full iteration of table
• Single line statement
• More dynamic
• Efficient and fast
 */

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://classic.crmpro.com/");
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	       driver.findElement(By.xpath("//input[@value='Login']")).submit();
	       
	       driver.switchTo().frame("mainpanel");
	       
	       driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	       
	       //Method 1
	       //*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
	       //*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
	       //*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
	       
	     //*[@id="vContactsForm"]/table/tbody/tr[24]/td[2]/a
	       
	      for(int i=4;i<=24;i++)
	       {
	    	   String name=driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[2]/a")).getText();
	    	   if(name.contains("Muktha"))
	    	   {
	    		 //*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input
	    		   
	    		   driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
	    		   break;
	    	   }
	       }
	       
	       System.out.println("Done");
	      
	    //   Method 2
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Muktha Sharma')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	       

	}

}
