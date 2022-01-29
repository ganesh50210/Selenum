package webpagespraticed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("7095621156");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("Ganesh1824*");
        driver.findElement(By.name("login")).click();
        
        

	}

}
