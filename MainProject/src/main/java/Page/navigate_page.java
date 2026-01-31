package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigate_page {
	
	 WebDriver driver;
 
     
	public navigate_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
 
	//Back to the page
 	 public void back() throws InterruptedException
	 {
 	   driver.navigate().back();
 	   Thread.sleep(2000);
     }
 	 
 	//Refresh to the page
	 public void refresh() throws InterruptedException
	 {
 	   driver.navigate().refresh();
 	   Thread.sleep(2000);
     }
	 
	//Back to the page
	 public void back1() throws InterruptedException
	 {
 	   driver.navigate().back();
 	   Thread.sleep(2000);
     }

}