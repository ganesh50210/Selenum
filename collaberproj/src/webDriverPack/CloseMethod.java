package webDriverPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.collabera.com/");
        driver.close();

	}

}
