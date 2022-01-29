package webDriverPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class TittleUrlpgSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.collabera.com/");
        
        
        String ref = driver.getCurrentUrl();
        System.out.println(ref);

	}

}
