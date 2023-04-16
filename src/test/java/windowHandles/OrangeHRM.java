package windowHandles;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver  =	new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentId = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> wIds = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(wIds);
		String child = windows.get(1);
		driver.switchTo().window(child);
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("tanweerbuddy");
		
		
	}

}
