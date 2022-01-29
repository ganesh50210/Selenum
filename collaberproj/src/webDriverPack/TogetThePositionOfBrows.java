package webDriverPack;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetThePositionOfBrows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.skillRary.com/");
        
       Point point = driver.manage().window().getPosition();
      int xvalue = point.getX();
      int yvalue = point.getY();
       
       System.out.println("Thexalue is:"+xvalue+  "Thexalue is: "+yvalue);

	}

}
