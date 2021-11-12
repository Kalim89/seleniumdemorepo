import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Hello");
		driver.switchTo().frame("frm1");
		WebElement course = driver.findElement(By.id("course"));
		Select courseId= new Select(course);
		courseId.selectByVisibleText("Java");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Frame3");
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("first Name");
		driver.findElement(By.id("lastName")).sendKeys("last Name");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Nested Frame");
		
		
		
		

	}

}
