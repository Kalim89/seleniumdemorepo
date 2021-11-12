import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32 (4)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewTab")).click();
		String pid = driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
	    for(String id:allWindow)
	    {
	    	driver.switchTo().window(id);
	    	System.out.println(driver.getTitle());
	    	if(!(id.equals(pid)))
	    	{
	    		driver.close();
	    	}
	    }
		
		
		
	}

}
