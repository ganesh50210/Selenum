package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
      //  String YTtxt = driver.findElement(By.id("chips")).getText();
        driver.findElement(By.className("ytd-searchbox-spt")).sendKeys("Jack Ma");
        

	}

}
