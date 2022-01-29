package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandRobot {

	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.oyorooms.com/");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		
	}
}
