package handling_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_FirstSelected_Option {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tanweer/Desktop/seleniumhtml/RestaurantMenulist.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement checkPost_List = driver.findElement(By.id("cp"));
		
		System.out.println("All the options present in list :");
		Select s = new Select(checkPost_List);
		 List<WebElement> allOptions = s.getOptions();
		 for(WebElement list:allOptions)
		 {
			String t = list.getText();
			System.out.println(t);
		 } 
		WebElement fOption = s.getFirstSelectedOption();
		String text = fOption.getText();
		System.out.println("First Selected :"+text);
		
		//all seletedOption
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println("All Selected Item :");
		for(WebElement selected:options)
		{
			String text2 = selected.getText();
		
			System.out.println(text2);
		}

	}

}
