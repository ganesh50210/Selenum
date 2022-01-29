package testNG_Basics01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @Test (priorty=1)
      public void createloan() {
    		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    		WebDriver driver =new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.quit();
      }
      
      @Test (priorty=2,dependsOnMethods="deleteloan")
      public void modifyloan() {
    		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    		WebDriver driver =new ChromeDriver();
            driver.get("https://www.bookmyshow.com/");
            driver.quit();
      }
      
      @Test(priorty=-1)
      public void deleteloan() {
    		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    		WebDriver driver =new ChromeDriver();
            driver.get("https://www.zomato.com/");
            driver.quit();
      }
      
      @Test  (priorty=3)
      public void repayloan() {
    		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    		WebDriver driver =new ChromeDriver();
            driver.get("https://www.amazon.com/");
            driver.quit();
      }
      
	}

}
