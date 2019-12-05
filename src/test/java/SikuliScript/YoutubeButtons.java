package SikuliScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class YoutubeButtons {

	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String filepath = "D:\\Selenium\\Workspace\\Selenium\\SikuliImages\\";
  
        Screen s = new Screen();
        Pattern openButton = new Pattern(filepath + "Play.PNG");

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/playlist?list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT");

        // Click on Browse button and handle windows pop up using Sikuli
        s.wait(openButton, 20);
        s.click(openButton);

	}

}
