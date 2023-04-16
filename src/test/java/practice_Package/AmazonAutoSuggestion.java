package practice_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver  =	new ChromeDriver();
		driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone13");
	    Thread.sleep(5000);
	    
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		int count=allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		allSugg.get(0).click();
		
         
		 
	}

}
