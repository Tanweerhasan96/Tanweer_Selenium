package automate_WebApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Different_Frames 
{
	public static void switchToFrame(WebDriver driver,WebElement frame)
	{
		driver.switchTo().frame(frame);
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ankur.com/projects/FrameGlider/demo/simple/a.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		
		//pehla frame me switch krke source element ko hold krnge 
		WebElement sourceFrame = driver.findElement(By.id("b"));
		switchToFrame(driver, sourceFrame);
		WebElement sourceElement = driver.findElement(By.id("Dra1"));
		action.moveToElement(sourceElement).clickAndHold().build().perform();
		
		// ab hmlog target frame me jake target element me release krnge 
		WebElement targetFrame = driver.findElement(By.id("c"));
		switchToFrame(driver,targetFrame);
		WebElement targetElement = driver.findElement(By.id("Dra2"));
		action.moveToElement(targetElement).release().perform();
		
		// ab hmlog parent frame me aake text ko print krnge
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.id("messages")).getText();
		System.out.println(text);
		
		
		

	}

}
