package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage 
{
 WebDriver driver;
 public void LogInPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 @FindBy(id="txtUsername")
 private WebElement usernametextfield;
 @FindBy(how=How.ID,using="txtPassword")
 private WebElement passwordtextfield;
 @FindBy(how=How.ID,using="btnLogin")
 private WebElement loginbutton;
 
 public void setUsername(String username)
 {
	 usernametextfield.sendKeys(username);
 }
 public void setPassword(String password)
 {
	 passwordtextfield.sendKeys(password);
 }
 public void clickLoginButton()
 {
	 loginbutton.click();
 }
 
}
