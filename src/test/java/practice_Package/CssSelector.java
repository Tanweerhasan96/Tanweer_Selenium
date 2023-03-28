package practice_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) 
	{
	  WebDriver driver  =	new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
	  //Tag and id
	  //driver.findElement(By.cssSelector("input[id='email']")).sendKeys("tanweer1213@gmail.com");
	  //driver.findElement(By.cssSelector("#email")).sendKeys("tanweer1213@gmail.com");//Input#email
	 
	  //Tag and class
	  driver.findElement(By.cssSelector("input.inputtext")).sendKeys("tanweer1213@gmail.com");
	 // driver.findElement(By.cssSelector(".inputtext")).sendKeys("tanweer1213@gmail.com");
	}

}
