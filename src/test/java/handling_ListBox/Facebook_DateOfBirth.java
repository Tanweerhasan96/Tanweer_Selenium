package handling_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DateOfBirth {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement daylist = driver.findElement(By.id("day"));
		Select s = new Select(daylist);
		s.selectByIndex(11);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select s1 = new Select(monthlist);
		s1.selectByValue("12");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		Select s2 = new Select(yearlist);
		s2.selectByVisibleText("1996");
		
	}

}
