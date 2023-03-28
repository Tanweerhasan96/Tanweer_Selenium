package practice_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Google {

	public static void main(String[] args) throws InterruptedException 
	{

		 WebDriver driver  =	new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("q")).sendKeys("java");
		  Thread.sleep(2000);
		
          List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
          int s= allSugg.size();
          System.out.println(s);
          for(WebElement list:allSugg)
          {
        	 String text = list.getText();
        	 System.out.println(text);
          }
          allSugg.get(1).click();

		
	}

}
