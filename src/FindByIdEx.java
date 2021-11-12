import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByIdEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement Username=driver.findElement(By.id("email"));
		WebElement Password =driver.findElement(By.id("pass"));
		WebElement Button=driver.findElement(By.name("login"));
		WebElement New=driver.findElement(By.className("_6ltg"));
		Password.sendKeys("Arohi");
		//Button.click();
		New.click(); 
		//Forget.click(); 
		

	}

}
