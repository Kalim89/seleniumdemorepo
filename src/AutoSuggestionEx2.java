import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Thor");
		WebElement searchbox =driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']"));
		searchbox.click();
		List<WebElement> videoSuggestion = driver.findElements(By.xpath("//yt-formatted-string[contains(text(),'Thor')]"));
		System.out.println(videoSuggestion.size());
		videoSuggestion.get(0).click();
		
		
		
	}

}
