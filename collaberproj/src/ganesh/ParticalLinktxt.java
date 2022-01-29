package ganesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticalLinktxt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.actitime.com/login.do");
        driver.findElement(By.linkText("password?")).click();

	}

}
