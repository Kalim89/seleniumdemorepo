import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBycssSelectorEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.cssSelector("input[type='text']"));
		WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));
		User.sendKeys("Santosh");
		pass.sendKeys("BabuRao");*/
		
		driver.get("https://www.actitime.com/");
		WebElement Link=driver.findElement(By.linkText("Start Using actiTIME"));
		WebElement First=driver.findElement(By.xpath("//input[@placeholder='Enter your first name']"));
		//WebElement Second=driver.findElement(By.cssSelector("input[placeholder='Enter your last name']"));
	//	WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
	//	WebElement company =driver.findElement(By.cssSelector("input[placeholder='Company']"));
		//WebElement login=driver.findElement(By.cssSelector("input[type='Submit']"));
		Link.click();
		First.sendKeys("Abrahim");
		//Second.sendKeys("Khan");
	//	email.sendKeys("khan@gmail.com");
		// company.sendKeys("Google");
		// login.click();
		 

		
		
		

	}

}
