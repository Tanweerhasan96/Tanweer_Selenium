package automate_WebApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus_DatePick 
{
	@Test
	public static void main()
	{
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.redbus.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  String date="25";
		  String month="May";
		  String year="2023";
		  
		  driver.findElement(By.id("onward_cal")).click();
		  
		  while(true)
		  {
			 String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			 String[] ar = monthyear.split(" ");
			 String mon = ar[0];
			 String yr=ar[1];
			 if(yr.equalsIgnoreCase(year) && mon.equalsIgnoreCase(month))
			 {
				break; 
			 }
			 else
			 {
				 driver.findElement(By.xpath("//td[@class='next']")).click();
			 }
			 List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			
			 for(WebElement ele:dates)
			 {
				 String dat =ele.getText();
				 if(dat.equalsIgnoreCase(date))
				 {
					 ele.click();
					 break;
				 }
			 }
			  
		  }
		  
		
	}

}
