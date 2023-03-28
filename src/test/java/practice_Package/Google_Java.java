package practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Java {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));

		int count = allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		allSugg.get(count-1).click();//click on last element
		
		driver.close();
		
	}

}
