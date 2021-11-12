import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement sign=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		sign.click();
		WebElement New = driver.findElement(By.id("createAccountSubmit"));
		New.click();
		WebElement Name = driver.findElement(By.xpath("//*[@id='ap_customer_name']"));
		Name.sendKeys("Santosh");
		WebElement Phone=driver.findElement(By.id("ap_phone_number"));
		Phone.sendKeys("78643324662");
		WebElement Email = driver.findElement(By.id("ap_email"));
		Email.sendKeys("khanKalim@gmail.com");
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("halwahaiKya");
		WebElement Submit = driver.findElement(By.cssSelector("input[type='submit']"));
		Submit.click();
		
		
		
		
		
		
		

	}

}
