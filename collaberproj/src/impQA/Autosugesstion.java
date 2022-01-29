package impQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autosugesstion{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allAutosuggestions=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allAutosuggestions.size();
		System.out.print(count);
		for(WebElement sugg:allAutosuggestions){
			System.out.println(sugg.getText());
		}
			
	allAutosuggestions.get(1).click();
	driver.close();
		}	
	}




