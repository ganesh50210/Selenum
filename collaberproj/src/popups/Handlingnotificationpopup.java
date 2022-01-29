package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingnotificationpopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		WebDriverWait explicitwait =new WebDriverWait(driver,10);
		driver.get("https://www.oyorooms.com/");
     	Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
	//	Thread.sleep(3000);
	//  robot.keyPress(KeyEvent.VK_TAB);
	//   Thread.sleep(3000);
	//	robot.keyPress(KeyEvent.VK_TAB);
	//	Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_TAB);
		
	}

}
