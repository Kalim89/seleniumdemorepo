import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement list=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(list);
		sel.selectByIndex(4);
		//sel.deselectByIndex(4);
		System.out.println(sel.isMultiple());
		List<WebElement> option= sel.getOptions();
		System.out.println(option.size());
		for(int i=1;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		

	}

}
