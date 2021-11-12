package TestNgFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting 
{
 WebDriver driver;
 
 @BeforeMethod
	public void setup()
 {
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
 }
 
 @Test(dataProvider="LoginData")
 public void logInTest(String user,String pwd,String rst)
 {
	 driver.get("https://admin-demo.nopcommerce.com//login");
	WebElement Username=driver.findElement(By.id("Email"));
	Username.clear();
	Username.sendKeys(user);
	WebElement Password = driver.findElement(By.id("Password"));
	Password.clear();
	Password.sendKeys(pwd);
	driver.findElement(By.xpath("//button[.=\"Log in\"]")).click();
	String exptitle= "Dashboard / nopCommerce administration";
	String acttitle= driver.getTitle();
	
	if(rst.equals("Valid"))
	{
		if(exptitle.equals(acttitle))
		{
			driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	else 
	{
		if(exptitle.equals(acttitle))
		{
			//driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
		}
		
	}
	
 }
 @DataProvider(name="LoginData")
 public String[][] getData() throws IOException
 {
	/* String loginData[][] = {
			 {"admin@yourstore.com","admin","Valid"},
			 {"admin@yourstore.com","admn","Invalid"},
		     {"Admin@yourstore","admin","Invalid"}*/
	 
	 String path=".\\TestDataFile\\loginTestData.xlsx";
	 XLUtility utility=new XLUtility(path);
	int totalrow= utility.getRowNum("sheet1");
	int totalcol= utility.getCellNum("sheet1", 1);
	String loginData[][]=new String[totalrow][totalcol];
	for(int i=1;i<=totalrow;i++)
	{
		for(int j=0;j<totalcol;j++)
		{
			loginData[i-1][j]=utility.getCellData("sheet1", i, j);
		}
		    	
				 		
				 			 
			
			 		
			 
	                        };
	 return loginData;
 }
 @AfterMethod
 public void tearDown()
 {
	 driver.close();
 }
}
