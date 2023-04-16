package mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.icc-cricket.com/homepage");
		
		
		WebElement target = driver.findElement(By.xpath("(//button[contains(text(),'Scores')])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Live Scores')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Women')]")).click();
		String text = driver.findElement(By.xpath("//div[@class='match-block__team-container']/parent::div[@class='match-block match-block--result t-t20i ']/child::div[3]")).getText();
	    System.out.println(text);
	    driver.close();

	}

}
