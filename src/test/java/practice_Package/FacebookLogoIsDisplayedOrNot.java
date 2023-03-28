package practice_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoIsDisplayedOrNot {

	public static void main(String[] args)
	{
		 WebDriver driver  =	new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
		  boolean logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]")).isDisplayed();
		  
		  if(logo==true)
		  {
			  System.out.println("Logo is Displayed and Pass");
		  }
		  else
		  {
			  System.out.println("Logo is not Displayed and Failed");
		  }
		 boolean button = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		  if(button==true)
		  {
			  System.out.println("Button is Enabled");
		  }
		  else
		  {
			  System.out.println("Button is not Enabled");
		  }
		  
		  int hEmail = driver.findElement(By.id("email")).getSize().getHeight();
		  System.out.println(hEmail);
		  int wEmail = driver.findElement(By.id("email")).getSize().getWidth();
		  System.out.println(wEmail);
		  
		 int hPassword = driver.findElement(By.id("passContainer")).getSize().getHeight();
		 int wPassword = driver.findElement(By.id("passContainer")).getSize().getWidth();
		 
		 if(hEmail==hPassword && wEmail==wPassword)
		 {
			 System.out.println("Heigth and Width of Username and Password is equal");
		 }
		 else
		 {
			 System.out.println("Heigth and Width of Username and Password is not equal");
		 }
		 int x = driver.findElement(By.name("login")).getRect().getX();
		 int y = driver.findElement(By.name("login")).getRect().getY();
		 System.out.println("X :"+x);
		 System.out.println("Y :"+y);
		 
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		  driver.close();

	}

}
