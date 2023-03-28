package practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_CheckboxStatus {

	public static void main(String[] args) {

		WebDriver driver  =	new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		 boolean status = driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
		 if(status==true)
		 {
			 System.out.println("Checkbox is selected");
		 }
		 else
		 {
			 System.out.println("Checkbox is not selected");
		 }
		 
		String text = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).getText();
		System.out.println(text);
		
		String link = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).getAttribute("href");
		System.out.println(link);
		
		String tag = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).getTagName();
		System.out.println(tag);
		driver.close();
		  
	}

}
