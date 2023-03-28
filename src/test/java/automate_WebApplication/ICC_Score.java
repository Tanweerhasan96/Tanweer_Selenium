package automate_WebApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ICC_Score 
{
	@Test
	public void main()
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//button[contains(text(),'Scores')])[1]"));
		Actions a=new Actions(driver);//cnt+shift+p
		a.moveToElement(ele).perform();//focus--->click on rendering, click on that element
		driver.findElement(By.xpath("(//a[contains(text(),'Live Scores')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Women')]")).click();
		String text = driver.findElement(By.xpath("//div[@class='match-block__team-container']/parent::div[@class='match-block match-block--result t-t20i ']/child::div[3]")).getText();
	    System.out.println(text);
	    driver.close();
	}

}
