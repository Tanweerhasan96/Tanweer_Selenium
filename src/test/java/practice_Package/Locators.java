package practice_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/tanweer/Desktop/qspider.html");
		driver.manage().window().maximize();
	    driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google")).click();
		
		
		
		
		driver.close();
		
		

	}

}
