package ganesh;

import org.openqa.selenium.chrome.ChromeDriver;

public class TittleUrlpgSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
       String tittle = driver.getTitle();
       System.out.print(tittle);
        String ref = driver.getCurrentUrl();
        System.out.println(ref);
      
       /* String pgsource = driver.getPageSource();
        System.out.println(pgsource);
        Thread.sleep(3000);  */
  driver.close();    
	}

}
