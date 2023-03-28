package popups;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup_Naukari {

	public static void main(String[] args)
	{ 
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("hasantanweer1996@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("tanweer152092");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'View & Update Profile')]")).click();
		
		File f = new File("./test-output/AutomationTanweerResume2.pdf");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
		driver.close();

		
	}

}
