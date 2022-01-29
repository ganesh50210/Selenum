package elf_27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demowebshop
{
	public static void main(String[] args)
	{
		
		//Test Data
		String testURL ="http://demowebshop.tricentis.com/";
		String Username ="tganesh2262@gmail.com";
		String pswd="!@#$%^&*";
		 String EXPloginPg =" ";
		 String EXPHmpgTittle ="Demo Web Shop";
		
		//step 1: Open the Browser Enter in URL:
		 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		// Deleting all Cookies of webpg:
		driver.manage().deleteAllCookies();
		System.out.println("Launched Browser Successfully");
        driver.manage().window().maximize();
        System.out.println(" Browser Maximized Successfully");
        
        //implicit waiting conditon :
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //EXplicit waiting conditon :
        WebDriverWait Explicitwait = new WebDriverWait(driver ,10);
        
        driver.get(testURL);
        String ActLginpg =driver.getTitle();
        if(ActLginpg.equals(EXPloginPg))
        {
        	System.out.println("Login pg was not Displayed Successfully");
        }
        else
        {
        	System.out.println("Login pg  Displayed Successfully");
        }
        
        
        WebElement clickingLoginbutton = driver.findElement(By.linkText("Log in"));
        clickingLoginbutton.click();
        
        //Step2 : Enter Username into username Txt field:
       WebElement Usertxtfld = driver.findElement(By.name("Email"));
       Usertxtfld .clear();
       Usertxtfld.sendKeys(Username);
        String ActUsernameEntered=Usertxtfld.getAttribute("value");
        if(ActUsernameEntered.equals(Username)){
        	System.out.println("Username entered on demowebshop pg Successfully");
        }
        else {
        	System.out.println(" Please enter a valid email address.");
        }
  
        //Step3: Enter password into Password TxtFld:
         WebElement Pswdtxtfld = driver.findElement(By.name("Password"));
         Pswdtxtfld .clear();
         Pswdtxtfld.sendKeys(pswd);
         String ActPasswordEntered=Usertxtfld.getAttribute("value");
         if(ActPasswordEntered.equals(pswd)) {
            	System.out.println("Password entered on demowebshop pg invalid");
         }
         else   {
            	System.out.println("Password entered on demowebshop pg valid");
         }
        
          //Step4: RADIO Button Remember Me:
         driver.findElement(By.id("RememberMe")).click();
         
         //Step5: demowebshop Login page should display
         driver.findElement(By.xpath("//input[@value='Log in']")).click();
         String ActhmpgTittle= driver.getTitle();
         
         if(ActhmpgTittle.equals( EXPHmpgTittle)){
         	System.out.println("Home pg Displayed Successfully");
       }
         else{
        	System.out.println("Home pg was not Displayed Successfully");
       }
         
         //demowebshop should log out Script:
         driver.findElement(By.linkText("Log out")).click();
	}
}
