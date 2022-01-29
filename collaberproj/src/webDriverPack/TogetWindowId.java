package webDriverPack;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.skillRary.com/");
        
        String windowid = driver.getWindowHandle();
        System.out.println(windowid);
        
        
        
        driver.get("https://www.naukri.com/");
        Set<String> windowids = driver.getWindowHandles();
      for(String windid:windowids)
      {
    	  System.out.println(windid);
      }
        driver.quit();

	}

}
