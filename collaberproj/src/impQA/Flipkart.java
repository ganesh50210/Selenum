package impQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://flipkart.com/");
        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("Smart Watches",Keys.ENTER);
       String countingsizeFlipkart = driver.findElement(By.className("_2kHMtA")).getText();
       driver.findElement(By.xpath(""));
    //  for( String onetxt:countingsizeFlipkart) {
    		  
    	  
      }
	}
