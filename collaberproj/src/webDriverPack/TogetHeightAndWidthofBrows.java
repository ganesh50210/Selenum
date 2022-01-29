package webDriverPack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetHeightAndWidthofBrows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.skillRary.com/");
        
       Dimension dimensions = driver.manage().window().getSize();
       int height=dimensions.getHeight();
       int width = dimensions.getWidth();
        System.out.print("The height :" + height+ "The Width is :"+width);

	}

}
