package webDriverPack;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchtheDriverControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.naukri.com/");
        
        
     Set<String> allwindowhandles = driver.getWindowHandles();
     String expwindowtittle="Tech Mahindra";
        
     for(String wid:allwindowhandles) {
    	 driver.switchTo().window(wid);
    	 String actwindowtittle = driver.getTitle();
    	 if(expwindowtittle.equals(actwindowtittle)) {
    		 driver.quit();
    	 }
    	 
     }
        
        
        
	}
}
