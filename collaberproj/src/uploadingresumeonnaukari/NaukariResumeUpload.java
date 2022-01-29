package uploadingresumeonnaukari;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariResumeUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("crossWrapper")).click();
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.xpath("[placeholder='Enter your active Email ID / Username']")).sendKeys("tganesh50210@gmail.com");
		
		
	
	
	}

}
