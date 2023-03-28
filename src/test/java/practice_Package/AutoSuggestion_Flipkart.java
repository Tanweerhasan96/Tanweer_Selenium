package practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(@class,'KpZ')])[1]")).click();
		driver.findElement(By.name("q")).sendKeys("Roadstar");
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[contains(@class,'MRY')]"));
	    int count=	allSugg.size();
	    System.out.println(count);
	  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       for(WebElement ele:allSugg)
       {
    	   String text = allSugg.get(0).getText();
    	   System.out.println(text);
       }
       allSugg.get(0).click();

	}

}
