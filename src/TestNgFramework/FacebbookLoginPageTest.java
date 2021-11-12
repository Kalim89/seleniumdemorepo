package TestNgFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebbookLoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	@Test(priority=1,groups="title")
	public void getPageTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title,"Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra","title is matched");
	}
	@Test(priority=2,groups="logo")
	public void logoVerify()
	{
		WebElement logo= driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']"));
		boolean b=logo.isDisplayed();
		//Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	@Test(priority=3,groups="title")
	public void hoverMen()
	{
		WebElement MenShopping = driver.findElement(By.xpath("//a[@href='/shop/men'][1]"));
		Actions hover=new Actions(driver);
		hover.moveToElement(MenShopping).perform();
		WebElement MenTshirt=driver.findElement(By.xpath("//a[@href='/men-tshirts'][1]"));
		MenTshirt.click();
		String title= driver.getTitle();
		System.out.println(title);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
