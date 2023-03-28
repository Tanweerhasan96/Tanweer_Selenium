package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Browser_Tabs {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).click();
		Set<String> wId = driver.getWindowHandles();
		//count no of tabs present
	    System.out.println(	wId.size());
	    
	    for(String w:wId)
	    {
	    	driver.switchTo().window(w);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	driver.close();
	    }
	    
	    
		

	}

}
