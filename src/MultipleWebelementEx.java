import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleWebelementEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("G:/New folder/Demo.html");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		System.out.println(links.get(2).getText());
		System.out.println(links.get(1).getAttribute("href"));
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());

	}

}
