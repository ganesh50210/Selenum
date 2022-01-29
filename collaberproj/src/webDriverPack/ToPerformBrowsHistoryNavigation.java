package webDriverPack;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowsHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();//maximizing brows
        driver.get("https://www.skillRary.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.zomato.com/");// by using navigateto()
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.get("https://www.collabera.com/");//by using get ()
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();
        
        driver.navigate().to(new URL("https://www.myntra.com/"));//by using url inthe form of obj
        driver.quit();
        

	}

}
