package automate_WebApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip 
{
	@Test
	public static void main() throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
//	  driver.findElement(By.id("username")).sendKeys("hasantanweer1996@gmail.com");
//	  driver.findElement(By.className("capText font16")).click();
	  
//	  driver.findElement(By.id("fromCity")).click();
//	  Thread.sleep(5000);
//	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bengaluru");
//	  Thread.sleep(5000);
//	  List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//	  list.get(0).click();
	  
//	  driver.findElement(By.id("toCity")).click();
//	  driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Ranchi");
//	  
	
	}

}
