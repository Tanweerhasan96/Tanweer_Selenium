package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Popup {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> wId = driver.getWindowHandles();
		
		//print title of all the browser and close one by one
//		for(String w:wId)
//		{
//			driver.switchTo().window(w);
//			String title = driver.getTitle();
//			System.out.println(title);
//			driver.close();//close one by one
//		}
		
		//close specific browser 
		
		String closeBrowser="Facebook";
//		for(String w:wId)
//		{
//			driver.switchTo().window(w);
//			String title = driver.getTitle();
//			if(title.equals(closeBrowser))
//			{
//				driver.close();
//			}
//			
//		}
		//close all browser except specific browser
		
		     for(String w:wId)
	        {
				driver.switchTo().window(w);
				String title = driver.getTitle();
				if(title.equals(closeBrowser))
				{
					
				}
				else
				{
					driver.close();
				}
				
			}
		
	   
		
		

	}

}
