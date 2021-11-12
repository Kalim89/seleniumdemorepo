import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectboxEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/Compressed/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("G:/New folder/selectbox.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@name='country']"));
	    Select sel=new Select(listbox);
	    sel.selectByVisibleText("Brazil");
	    sel.selectByIndex(2);
	    sel.deselectByIndex(2);
	    
	    
		

	}

}
