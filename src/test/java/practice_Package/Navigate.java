package practice_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) 
	{
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.facebook.com/");
	    //driver.navigate().refresh();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	 
	    boolean logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]")).isDisplayed();
	    System.out.println(logo);
	    
	   boolean button = driver.findElement(By.name("login")).isSelected();
	   System.out.println(button);
	   
	  Dimension size = driver.findElement(By.id("email")).getSize();
	  System.out.println(size);
	 int heigth = driver.findElement(By.id("email")).getSize().getHeight();
	   System.out.println(heigth);
	  int width = driver.findElement(By.id("email")).getSize().getWidth();
      System.out.println(width);
       int rect = driver.findElement(By.name("login")).getRect().x;
      System.out.println(rect);
      String font = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
      System.out.println(font);
	}

}
