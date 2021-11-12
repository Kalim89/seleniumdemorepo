import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32 (4)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		
		
		driver.get("https://www.americanairlines.in/");
		driver.findElement(By.name("origin")).sendKeys("Bhubaneswar");
		driver.findElement(By.name("destination")).sendKeys("New York");
		WebElement adult = driver.findElement(By.id("flightSearchForm.adultPassengerCount"));
		Select sel = new Select(adult);
		sel.selectByIndex(3);
	     driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][1]")).click();
		
		for(int i=0;i<2;i++) 
		{
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		List<WebElement> list = driver.findElements(By.xpath("//a[.='28']"));
		System.out.println(list.size());
		list.get(1).click();
		Thread.sleep(20000);
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui-datepicker-trigger'][2]")));
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][2]")).click();
		
		
		
		
		
		
		
		 
		
		
		
		

	}

}
