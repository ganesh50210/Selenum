package ganesh;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.naukri.com/");
        driver.close();

	}

}
