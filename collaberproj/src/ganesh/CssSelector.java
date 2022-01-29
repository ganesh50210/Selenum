package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/ACER/Desktop/Demo1.html");
      driver.navigate().back();
        driver.findElement(By.cssSelector("d1")).click();
       driver.navigate().back();
        driver.findElement(By.cssSelector("n1")).click();
      driver.navigate().back();
        driver.findElement(By.cssSelector("c1")).click();
      driver.navigate().refresh();
      driver.navigate().back();
        driver.findElement(By.cssSelector("//a[2]")).click();
       driver.navigate().back();
       driver.close();

	}

}
