package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage
{
WebDriver driver;
public void AddEmployeePage(WebDriver driver)
{
	this.driver=driver;
}
@FindBy(xpath="//a[.='Dashboard']")
private WebElement openPagetext;
@FindBy(how=How.XPATH,using="//a[.='PIM']")
private WebElement pimMenu;

@FindBy(how=How.ID,using="menu_pim_addEmployee")
private WebElement addEmployeeButton;

public void getTextOfPage()
{
	System.out.println(openPagetext.getText());
}

public void hoverPimMenu(WebDriver driver)
{
	this.driver=driver;
	Actions action= new Actions(this.driver);
	action.moveToElement(pimMenu).perform();
	
}
public void clickAddEmployeeButton()
{
	addEmployeeButton.click();
}
}