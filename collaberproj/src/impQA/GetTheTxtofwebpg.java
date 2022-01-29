package impQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheTxtofwebpg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
          ChromeDriver driver =new ChromeDriver();
          driver.manage().window().maximize();
	      driver.get("https://www.urbanladder.com/");
	   String txt = driver.findElement(By.id("topnav_wrapper")).getText();
	     
	     System.out.println(txt);
	      
	    

	}

}
