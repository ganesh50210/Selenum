package webDriverPack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByusingSetManage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.skillRary.com/");
        
       Dimension dimensions = new Dimension(1212,1300);
       driver.manage().window().setSize(dimensions);

       Thread.sleep(3000);
       driver.quit();
	}

}
