import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPopup {

	public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//a[.='Download sample pdf file']")).click();
		

	}

}
