package ganeshassigments;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
		
		
		public static void main(String[] args) throws InterruptedException {
			LocalDateTime ltd=LocalDateTime.now().plusDays(6);
			String month = ltd.getMonth().name();
			month=month.substring(0, 1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
			System.out.println(month);
			int date = ltd.getDayOfMonth();
			int year = ltd.getYear();

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			

			driver.get("https://www.agoda.com/en-in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[.='Not now']")).click();
			driver.findElement(By.xpath("//div[@data-element-name='check-in-box']")).click();
			Thread.sleep(2000);


			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,150)");

			for(;;) {
				
				try {
					driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//span[text()='"+date+"']")).click();
					break;
				}catch(NoSuchElementException e) {
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
					driver.quit();
				}
	}

		}
	
}
