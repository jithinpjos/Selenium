package SeleniumProject.Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://classic.crmpro.com/");
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	       driver.findElement(By.xpath("//input[@value='Login']")).submit();
	       
	       driver.switchTo().frame("mainpanel");
	       
	       
	       //1.Get All the links and images
	       
	      List<WebElement> linkList= driver.findElements(By.tagName("a"));
	      linkList.addAll(driver.findElements(By.tagName("img")));
	      
	      System.out.println("Total number of links and images :"+linkList.size());
	      
	      
	      //2.Remove invalid links
	      List<WebElement> activeLinks=new ArrayList<WebElement>();
	      
	      for(int i=0;i<linkList.size();i++) {
	    	  
	    	//  System.out.println(linkList.get(i).getText());
	    	  
	    	  if(linkList.get(i).getAttribute("href") !=null && !linkList.get(i).getAttribute("href").contains("javascript")) {
	    		
	    		    activeLinks.add(linkList.get(i));
	    		 
	    	  }
	      }
	      System.out.println("Total number of active links and images :"+activeLinks.size());
	      
	      //3.Check the links using httpURLConnection
	      for(int j=0;j<activeLinks.size();j++)
	      {
	    	  if(!activeLinks.get(j).getText().isEmpty())
	    	  {
			      //System.out.println(activeLinks.get(j).getText());
			      HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			      connection.connect();
			      String response=connection.getResponseMessage();
			      connection.disconnect();
			      System.out.println(activeLinks.get(j).getText()+" ----> "+response);	
	    	  }
	      }
	}

}
