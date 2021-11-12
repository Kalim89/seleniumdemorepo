import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {
	WebDriver driver;
	public void launchFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\Selenium Browser driver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\Selenium Browser driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.myntra.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();		
	}

	public static void main(String[] args)
	{
		LaunchingBrowser ob=new LaunchingBrowser();
		//ob.launchFirefox();
		ob.launchChrome();
		

	}

}
