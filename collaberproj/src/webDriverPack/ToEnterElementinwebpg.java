package webDriverPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterElementinwebpg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
    WebElement activeElement = driver.switchTo().activeElement();
    activeElement.sendKeys("ebrahim");   
	}
}
