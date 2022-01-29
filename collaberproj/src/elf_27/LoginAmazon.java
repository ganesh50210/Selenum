package elf_27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement daylistbox=driver.findElement(By.id("day"));
        WebElement monthlistbox = driver.findElement(By.id("month"));
        WebElement yearlistbox = driver.findElement(By.id("year"));
         
        Select dayselect =new Select(daylistbox);
        System.out.println(dayselect.isMultiple());
        
	}

}
