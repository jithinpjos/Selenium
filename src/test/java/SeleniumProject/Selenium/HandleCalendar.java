package SeleniumProject.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba77");
	    driver.findElement(By.xpath("//input[@value='Login']")).submit();
	    
	    driver.switchTo().frame("mainpanel");
	    
	    String inputDate="1-March-2018";
	   String[] dateArray= inputDate.split("-");
	   String day=dateArray[0];
	   String Month=dateArray[1];
	   String Year=dateArray[2];
	   
	   Select calMonth=new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
	   calMonth.selectByVisibleText(Month);
	   
	   Select calYear=new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
	   calYear.selectByVisibleText(Year);
	   
	 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
	 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
	 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]
	   
	 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
	   
	 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]
	   
	   String Before="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	   String After="]/td[";
	   String dateval;
	   boolean flag=false;
	  for(int rownumber=2;rownumber<=7;rownumber++) {
		  for(int columnnumber=1;columnnumber<=7;columnnumber++) {
			  
			  try {
			  dateval=driver.findElement(By.xpath(Before+rownumber+After+columnnumber+"]")).getText();
			  }
			  catch(NoSuchElementException e)
			  {
				  System.out.println("Invalid Date");
				  flag=false;
				  break;
			  }
			  
			  if(dateval.equals(day)) {
				  driver.findElement(By.xpath(Before+rownumber+After+columnnumber+"]")).click();
				  flag=true;
				  break;
			  }
		  }
		  if(flag) {
			  break;
		  }
	  }
	   
		
	}

}
