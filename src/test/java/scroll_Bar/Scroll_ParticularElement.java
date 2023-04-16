package scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_ParticularElement {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.bbc.com/");
	    int y = driver.findElement(By.xpath("//a[contains(text(),'World in pictures')]")).getLocation().getY();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,"+y+")");
	   String text = driver.findElement(By.xpath("//a[contains(text(),'World in pictures')]")).getText();
	   System.err.println(text);
	}

}
