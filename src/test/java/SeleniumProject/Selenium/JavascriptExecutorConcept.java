package SeleniumProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://classic.crmpro.com/");
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Saibaba777");
	      WebElement loginbtn= driver.findElement(By.xpath("//input[@value='Login']"));
	      
	      flash(loginbtn,driver);
	      drawBorder(loginbtn,driver);
	      generateAlert( driver,"Login button is highlighted");
	      driver.switchTo().alert().accept();
	      clickElementByJS(loginbtn,driver);
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavanreddy");
	      refreshBrowserByJS(driver);
	      
	     System.out.println(getTitleByJS(driver));
	      
	     System.out.println(getPageInnerText(driver));
	     
	    // scrollPageDown(driver);
	     
	     WebElement forgotPassword=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
	     scrollIntoView(forgotPassword, driver);
	}
	

	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
	
	
    public static void drawBorder(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    
    public static void generateAlert(WebDriver driver, String message){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("alert('"+message+"')");

    }
    
    public static void clickElementByJS(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", element);
    	
    }
	
    public static void refreshBrowserByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("history.go(0)");
    }
    
    public static String getTitleByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String title = js.executeScript("return document.title;").toString();
    	return title;
    }
    
    public static String getPageInnerText(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
    	return pageText;
    }
    
    public static void scrollPageDown(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    
    public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    

}
