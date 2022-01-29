package webDriverPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingsStaticwebpg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.skillrary.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[text()='Job of SRE in IT']")).click();
	}
}
