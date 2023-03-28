package practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste {

	public static void main(String[] args) throws Throwable
	{
		  WebDriver driver  =	new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.id("email")).sendKeys("tanweerbuddy");
		   driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		  // Thread.sleep(3000);
		   driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
		  
	

	}

}
