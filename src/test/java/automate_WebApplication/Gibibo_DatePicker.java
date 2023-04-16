package automate_WebApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gibibo_DatePicker
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.goibibo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  String date="25";
		  String month="May";
		  String year="2023";
		
	}

}
