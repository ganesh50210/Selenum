package ganesh;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallWindowsofNavukari {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	   Set<String> tittle = driver.getWindowHandles();
	   System.out.println(tittle);
				

	}
}