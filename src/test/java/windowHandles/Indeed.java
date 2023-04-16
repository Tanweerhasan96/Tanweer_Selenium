package windowHandles;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

	public static void main(String[] args) throws InterruptedException
	{
		String eTitle="Facebook";
		WebDriver driver  =	new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("login-facebook-button")).click();
	    driver.findElement(By.id("apple-signin-button")).click();
		String expTitle="Facebook";
		Set<String> wiD = driver.getWindowHandles();
		ArrayList<String> listWid = new ArrayList<String>(wiD);
		String parentId = listWid.get(0);
		String appleId = listWid.get(1);
		String facebookId = listWid.get(2);
		driver.switchTo().window(appleId);
		driver.findElement(By.id("account_name_text_field")).sendKeys("tanweer");
		driver.switchTo().window(facebookId);
		driver.findElement(By.id("email")).sendKeys("TanweerLove"); 
		
		for(String w:wiD)
		{
			driver.switchTo().window(w);
			String title=driver.getTitle();
			if(title.equals(expTitle))
			{
				
			}
			else
			{
				driver.close();
			}
		}	   
	}
	
	}


