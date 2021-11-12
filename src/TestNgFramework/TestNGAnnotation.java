package TestNgFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation 
{
	@BeforeSuite
	public void setUp()
	{
		System.out.println("set the property for chrome");
	}
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("launch chrome browser");
		}
@BeforeClass
public void setURL()
{
	System.out.println("Enter a URL");
}

@BeforeMethod
public void login()
{
	System.out.println("login to app");
}

@Test
public void googleTitle()
{
	System.out.println("Google title text");
}
@Test
public void searchText()
{
	System.out.println("search Text");
}
@Test
public void googleLogo()
{
	System.out.println("Google logo test");
}
@AfterMethod
public void logOut()
{
	System.out.println("Log out of app");
}

@AfterClass
public void closeBrowser()
{ 
	System.out.println("Delete All the Cookies");
}
@AfterTest()
public void deleteAllCookies()
{
	System.out.println("Close the browser");
}
@AfterSuite
public void generateTestReport()
{
	System.out.println("Generated Test Report");
}

}
