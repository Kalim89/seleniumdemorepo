package com.testngParametersPassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassEx {

	WebDriver driver;
	@Test
	@Parameters({"firstname","lastname"})
	public void YahooLoginPage(String firstname,String lastname) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mail.yahoo.com/?.intl=in&.lang=en-IN");
		String HomePageUrl=driver.getCurrentUrl(); 
		Assert.assertEquals(HomePageUrl,"https://mail.yahoo.com/?.intl=in&.lang=en-IN");
		WebElement signupButton=driver.findElement(By.xpath("//a[.='Sign up']"));
		signupButton.click();
		Thread.sleep(5000);
		String signupPage=driver.getTitle();
		System.out.println(signupPage);
		Assert.assertEquals(signupPage,"Yahoo");
		WebElement logo=driver.findElement(By.xpath("//img[@class='logo ']"));
		boolean b= logo.isDisplayed();
		Assert.assertEquals(true, b);
		WebElement username=driver.findElement(By.id("usernamereg-firstName"));
		username.clear();
		username.sendKeys(firstname);
		WebElement lastnameTextField=driver.findElement(By.id("usernamereg-lastName"));
		lastnameTextField.clear();
		lastnameTextField.sendKeys(lastname);
		
		
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
