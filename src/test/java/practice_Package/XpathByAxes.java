package practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		String text = driver.findElement(By.xpath("//h4[contains(text(),'Curl Edge Cotton T-shirt')]/parent::div/descendant::span/child::span[@class='product-discountedPrice']")).getText();
//	    System.out.println(text);
	    
	}

}
