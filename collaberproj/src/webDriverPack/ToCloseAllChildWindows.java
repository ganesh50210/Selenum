package webDriverPack;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.naukri.com/");
        
        String parentwindowpg = driver.getWindowHandle();
        Set<String> allwindowIDs = driver.getWindowHandles();
        
        allwindowIDs.remove(parentwindowpg);
        
        
        
        for(String winid:allwindowIDs) {
          driver.switchTo().window(winid);
          Thread.sleep(3000);
          driver.close();
        }
}
}