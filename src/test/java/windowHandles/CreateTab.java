package windowHandles;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTab {

	public static void main(String[] args)
	{
		//String str=""
		WebDriver driver  =	new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.open()"," ");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.get("https://www.youtube.com");
		String youtubeTitle = driver.getTitle();
		
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("tanweerbuddy");
		driver.switchTo().window(tabs.get(0));
	    WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
	    ele.sendKeys("Beshramrang");
	    driver.findElement(By.id("search-icon-legacy")).click();
	    for(String ids:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(ids);
	    	String titel = driver.getTitle();
	    	if(titel.equals(youtubeTitle))
	    	{
	    		driver.close();
	    	}
	    }
	    
	    
		
		
		
		

	}

}
