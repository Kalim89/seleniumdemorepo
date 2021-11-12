import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Selenium");
		List<WebElement> suggest=driver.findElements(By.xpath("//span[contains(text(),'Selenium']"));
		System.out.println(suggest.size());
		//for(int i=0;i<=9;i++)
		//{
			//System.out.println(list.get(i).getText());
		//}
		//list.get(1).click();
	}

}
