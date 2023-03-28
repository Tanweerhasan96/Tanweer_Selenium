package practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locators {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	  Thread.sleep(2000);
	  List<WebElement> allSugg = driver.findElements(By.xpath("//div[contains(text(),'iphone 13')]"));
	  int a= allSugg.size();
	  System.out.println(a);
	  
	  for(WebElement ele:allSugg)
	  {
		 String text = ele.getText();
		 System.out.println(text);
	  }
	  allSugg.get(0).click();
	  JavascriptExecutor e=(JavascriptExecutor) driver;
	 // e.executeScript(")
//	 String text = driver.findElement(By.xpath("/span[contains(text(),'Apple iPhone 13 (128GB) - Starlight')]/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='//span[contains(text(),'Apple iPhone 13 (128GB) - Starlight')]/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='sg-row']/descendant::span[@class='a-price']/descendant::span[@class='a-price-whole']-row']/descendant::span[@class='a-price']")).getText();
//
//	 System.out.println(text);
//	 driver.close();
	 
	}

}
////span[contains(text(),'Apple iPhone 13 (128GB) - Starlight')]/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='sg-row']/descendant::span[@class='a-price']