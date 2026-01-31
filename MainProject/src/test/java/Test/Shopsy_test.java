package Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.base;
import Page.select_page;
import Page.Homepage;
import Page.category;
import Page.logo_page;
import Page.navigate_page;


public class Shopsy_test extends base {


   @Test(priority = 0)
	
	public void  logoverify() throws InterruptedException
	{
    	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test = extent.createTest("Logo verfication");
		logo_page obj =new logo_page(driver);
		
		//logo verification
		boolean a =obj.isDisplayed();
		Assert.assertTrue(a);
		System.out.println("Logo displayed status: " + a);
		
		//url verification
		String actualUrl = obj.url();
		Assert.assertTrue(actualUrl.contains("https://www.shopsy.in/"));
		System.out.println("Url verified successfully" +actualUrl);	
	}
   
	@Test(priority = 1)
	
	//Data entering
	public void  home() 
	
	{
		test = extent.createTest("Searching");
		Homepage obj1 =new Homepage(driver);
		
		obj1.place("watch");
    }
	
	@Test(priority = 2)
	
	//Screenshot
	public void  Screen() throws IOException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		test = extent.createTest("Screenshot");
		select_page obj2 =new select_page(driver);
		
		obj2.Screenshot();

     }
	
	@Test(priority = 3)
	
	//Language
	public void  flag() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		 test = extent.createTest("select by category");
	     category obj3=new category(driver);
	     
	}
	
	@Test(priority = 4)
	
	//Navigation
	public void navigate() throws InterruptedException
	{
		test = extent.createTest("Page navigation");
		navigate_page obj4 = new navigate_page(driver);
		
		obj4.back();
		obj4.refresh();
		obj4.back1();
	}
}