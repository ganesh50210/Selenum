package ganesh;

import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	}

}
