package SeleniumProject.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserWindowPopUps {

	public static void main(String[] args) {
		
		//1.Alerts javascript pop ups
		//2.File upload popup---Browse button(type=file,send keys(Path))
		//Browser Window Pop ups-(WindowHaldler API-getWindowHandles())
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.get("http://www.popuptest.com/goodpopups.html");
	     
	     driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
	     
	     Set <String> poups=driver.getWindowHandles();
	     
	     Iterator<String> it=poups.iterator();
	     
	     String parentpopup=it.next();
	     System.out.println("Parent pop up "+parentpopup);
	     
	     String childpopup=it.next();
	     System.out.println("Child pop up "+childpopup);
	     
	     driver.switchTo().window(childpopup);
	     
	     System.out.println("Child popup title:"+driver.getTitle());
	     
	     driver.close();
	     
	     driver.switchTo().window(parentpopup);
	     System.out.println("Parent popup title "+driver.getTitle());
	     
	     driver.close();
	}

}
