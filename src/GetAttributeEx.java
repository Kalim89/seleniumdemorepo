import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32 (4)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Kalim");
		String a=email.getAttribute("value");
		System.out.println(a);

	}

}
