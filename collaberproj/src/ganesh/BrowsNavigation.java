package ganesh;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.collabera.com/");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
        

	}

}
