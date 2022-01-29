package webDriverPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class ByusingManagetoFullScreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kalkifashion.com/");
         Thread.sleep(3000);
       
         driver.manage().window().fullscreen();

	}

}
