package handling_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_DropDown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='drp1']/div[@class='dropdown']")).click();
		List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		selectOptionFromDropDown(productType,"Accounts");

		

		
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		List<WebElement> selectProduct = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		selectOptionFromDropDown(selectProduct,"Current Accounts");
	
	}
	
	public static void selectOptionFromDropDown(List<WebElement>options,String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}

}
