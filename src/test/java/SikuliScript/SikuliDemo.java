package SikuliScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliDemo {

    public static void main(String[] args) throws FindFailed {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        String filepath = "D:\\Selenium\\Workspace\\Selenium\\SikuliImages\\";
  
        Screen s = new Screen();
        Pattern openButton = new Pattern(filepath + "SignIn.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Click on Browse button and handle windows pop up using Sikuli
        s.wait(openButton, 20);
        s.click(openButton);

        // Close the browser
        driver.close();

    }

}
