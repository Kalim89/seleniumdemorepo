import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupEx {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		/*driver.get("https://chercher.tech/practice/hidden-division-popup");
		WebElement popup = driver.findElement(By.xpath("//a[.='View Pop-up']"));
		popup.click();
		driver.findElement(By.xpath("//button[@class='close']")).click();*/
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	    
	}
}
