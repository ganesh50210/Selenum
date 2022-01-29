package selectclass ;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TohandleDropDown {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        WebElement daylistbox=driver.findElement(By.id("day"));
	        WebElement monthlistbox = driver.findElement(By.id("month"));
	        WebElement yearlistbox = driver.findElement(By.id("year"));
	         
	        Select select =new Select(daylistbox);
	        select.selectByIndex(0);
	        select.selectByValue("1");
	        select.selectByVisibleText("mango");
	        select.deselectByIndex(0);
	        select.deselectByVisibleText("Grapes");
	        
		}

	}
