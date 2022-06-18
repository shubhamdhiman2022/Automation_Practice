package banking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import banking.pageObjects.AddCustomerPage;
import banking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		//to handle frame
		if (is_iframe_Present(driver)>0)
			{
			//driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
			driver.navigate().refresh();
			addcust.clickAddNewCustomer();
			}
		
		addcust.custName("QA Shubham Dhiman");
		addcust.custgender("male");
		addcust.custdob("10","15","1997");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("Ambala");
		addcust.custstate("Haryana");
		addcust.custpinno("133101");
		addcust.custtelephoneno("1234567890");
		
		String email=randomestring()+"@yopmail.com";
		addcust.custemailid(email);
		addcust.custpassword("Pass@123");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean reg_success=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(reg_success==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			String table_data = driver.findElement(By.xpath("//table[@id ='customer']")).getText();
			System.out.println("Table data: " +table_data);
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
			
	}
}
