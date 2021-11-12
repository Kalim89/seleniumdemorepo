import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.xpath("//input[@name='email']"));
		User.sendKeys("Kalim");
		WebElement Pass=driver.findElement(By.xpath("//input[@name='pass']"));
		Pass.sendKeys("ererefefrdfefef");
		WebElement Button=driver.findElement(By.xpath("//button[@name='login']"));
		Button.click();
		
		

	}

}
