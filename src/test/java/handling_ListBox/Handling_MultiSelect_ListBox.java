package handling_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultiSelect_ListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tanweer/Desktop/seleniumhtml/RestaurantMenulist.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		s.selectByIndex(3);
		s.selectByValue("v");
		s.selectByVisibleText("ChowChowBath");
		s.deselectByIndex(3);
		s.deselectByValue("c");
		s.deselectAll();
		boolean status = s.isMultiple();
		System.out.println(status);
		
		Thread.sleep(5000);
		WebElement checkPost_List = driver.findElement(By.id("cp"));
		Select s1 = new Select(checkPost_List);
		WebElement fOption = s.getFirstSelectedOption();
		String text = fOption.getText();
		System.out.println(text);
		
		

	}

}
