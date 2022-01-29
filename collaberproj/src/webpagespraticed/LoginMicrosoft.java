package webpagespraticed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMicrosoft {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.microsoft.com/en-in");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.findElement(By.id("mectrl_headerPicture")).click();
        driver.findElement(By.name("loginfmt")).clear();
        driver.findElement(By.name("loginfmt")).sendKeys("tganesh50210@gmail.com",Keys.ENTER);
        driver.findElement(By.linkText("Use your password instead")).click();
        driver.findElement(By.name("passwd")).clear();
        driver.findElement(By.name("passwd")).sendKeys("Ganesh1824*",Keys.ENTER);
        driver.quit();
	}

}
