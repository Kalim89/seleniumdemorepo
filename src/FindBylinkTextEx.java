import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FindBylinkTextEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (4)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement link=driver.findElement(By.linkText("Beauty"));
		link.click();
		String Title=driver.getTitle();
		Assert.assertEquals("Personal Care - Buy Personal Care Products in India | Myntra", Title);

	}

}
