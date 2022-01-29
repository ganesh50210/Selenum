package webDriverPack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorByUsingLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/in/");
        driver.findElement(By.id("id_email_hero_fuji")).sendKeys("tganesh50210@gmail.com");
     

	}

}
