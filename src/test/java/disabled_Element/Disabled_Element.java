package disabled_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Element {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("file:///C:/Users/tanweer/Desktop/disabled.html");
	    
	    driver.findElement(By.id("d1")).sendKeys("admin");
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("document.getElementById(\"d2\").value='Manager'\r\n"
	    		+ "");
	  //  js.executeScript("document.getElementById(\"d3\").click()");
	    

	}

}
