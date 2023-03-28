package handling_ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tanweer/Desktop/seleniumhtml/RestaurantMenulist.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlist);
		List<WebElement> allOption = s.getOptions();
		for(WebElement list:allOption)
		{
			String text = list.getText();
			al.add(text);
			
		}
		Collections.sort(al);
		for(String i:al)
		{
			System.out.println(i);
		}

	}

}
