package webDriverPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class ByusingManageToMaxim {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ola.com/");
        

	}

}
