import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement link=driver.findElement(By.xpath("//a[.='Kids']"));
		Actions act=new Actions(driver);
		//act.click(link).perform();
		
		WebElement link2=driver.findElement(By.xpath("//a[.='Home & Living']"));
		act.contextClick(link2).perform();
		link.sendKeys("w");
		
	
		
		
		
	}

}
