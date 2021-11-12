package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		LogInPage login=PageFactory.initElements(driver,LogInPage.class);
		login.setUsername("Admin");
		login.setPassword("admin123");
		login.clickLoginButton();
		AddEmployeePage employee=PageFactory.initElements(driver,AddEmployeePage.class);
		employee.getTextOfPage();
		employee.hoverPimMenu(driver);
		Thread.sleep(5000);
		employee.clickAddEmployeeButton();
	}

}
