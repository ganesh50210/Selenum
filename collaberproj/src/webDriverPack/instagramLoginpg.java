package webDriverPack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLoginpg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(1300);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("8247484169");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("8247484169");
        

	}

}
