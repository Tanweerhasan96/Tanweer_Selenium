package practice_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterURL_Using_get_navigate {

	public static void main(String[] args) throws InterruptedException
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   driver.navigate().to("https://mail.google.com/");
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   driver.navigate().refresh();
	   String tilte = driver.getTitle();
	   System.out.println(tilte);
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   String html = driver.getPageSource();
	   System.out.println(html);
	   
	   
	   
	   
	   driver.close();

	}

}
