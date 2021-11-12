import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadUploadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\Selenium Browser driver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Download Files
		/*driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		driver.findElement(By.id("textbox")).sendKeys("fsdfhghkdshgkdskghdjhgsadkdhgfdhgbdsagdfkjgjdhgdfjhgdkghdf");
		driver.findElement(By.id("create")).click();
		driver.findElement(By.id("link-to-download")).click();
		Thread.sleep(8000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		for(int i=0;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(5000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);*/
		
		//Upload Files
		
		driver.get("https://omayo.blogspot.com/");
		WebElement uploadFile = driver.findElement(By.id("uploadfile"));
		uploadFile.sendKeys("G:\\wall\\spring_purple_flowers-1920x1080.jpg");
		
	}

}
