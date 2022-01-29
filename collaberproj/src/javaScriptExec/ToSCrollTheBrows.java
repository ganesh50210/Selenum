package javaScriptExec;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSCrollTheBrows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("https://www.skillrary.com/");
     //   JavascriptExecutor  js=(JavascriptExecutor) driver;
     //   js.executeScript(null, args);
      
        
        
        
	}

}
