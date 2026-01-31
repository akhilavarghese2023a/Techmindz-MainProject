package Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class logo_page {
	
	WebDriver driver;
    
	@FindBy(xpath ="//*[name()='svg' and @width='120' and @height='40']") WebElement logo1;
	
	
	public logo_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}

	 //For checking the logo is displayed or not
	 public boolean isDisplayed()
	 {
		 return logo1.isDisplayed();
		 
     }
	 
	 public String url()
	 {
		 return driver.getCurrentUrl();
	 }
	 
}