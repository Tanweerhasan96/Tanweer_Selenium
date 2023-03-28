package handling_ListBox;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_AllOption_Without_Duplicate {

	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();
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
			hs.add(text);
		}
		for(String i:hs)
		{
			System.out.println(i);
		}
		driver.close();

	}

}
