package automate_WebApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewTabs {

	public static void main(String[] args) throws AWTException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		  
		 //create tab using javascript
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.open()"," ");
		 ArrayList<String> tabs=  new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(0));
		 driver.get("https://www.facebook.com/");
		 driver.switchTo().window(tabs.get(1));
		 driver.get("https://www.youtube.com/");
		 driver.findElement(By.id("search")).sendKeys("besharamrang");
		 driver.findElement(By.id("search-icon-legacy")).click();
		 //driver.quit();
		 
//		 //create by using robot class
//		 Robot rb = new Robot();
//		 rb.keyPress(KeyEvent.VK_CONTROL);
//		 rb.keyPress(KeyEvent.VK_T);
//		 rb.keyRelease(KeyEvent.VK_CONTROL);
//		 rb.keyRelease(KeyEvent.VK_T);
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(0));
//		driver.get("https://www.facebook.com/");
//		driver.switchTo().window(tabs.get(1));
//		driver.get("https://www.youtube.com/");
//		 
		 
		 
		 
		 

	}

}
