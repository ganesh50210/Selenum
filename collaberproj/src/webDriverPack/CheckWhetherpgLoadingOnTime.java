package webDriverPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhetherpgLoadingOnTime {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //  driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
       driver.get("https://www.swiggy.com/");

       File tempfile = driver.getScreenshotAs(OutputType.FILE);
       System.out.println(tempfile);
       
     File destfile=new File("./Errorpics/Scrn.png");
    // FileUtils.copyFile(tempfile, destfile);
	    System.out.print(destfile);
    //  destfile.renameTo(tempfile);
    // FileUtils.copyFile(tempFile, destFile);
     
     
     // File wedestfile = driver.findElement(By.xpath("//span[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
    //  File wedestfile1=new File("./Errorpicks/Scrn.png");
   // System.out.print(wedestfile1);
     
     
     
       
        

	}

}
