package ganesh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class ResizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maxfashion.in/");
		driver.manage().window().setSize(new Dimension(100, 200));
	}

}
