package handling_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_AllOption_Without_Loop {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tanweer/Desktop/seleniumhtml/RestaurantMenulist.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement checkPost_List = driver.findElement(By.id("cp"));
		Select s = new Select(checkPost_List);
		WebElement allOption = s.getWrappedElement();
		String text = allOption.getText();
		System.out.println(text);

	}

}
