package banking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import banking.pageObjects.EditCustomerPage;
import banking.pageObjects.LoginPage;
public class TC_EditCustomerTest_004 extends BaseClass
{
	@Test
	public void editCustomer() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		editcust.clickEditCustomer();
		 
		logger.info("providing customer details....");
		if (is_iframe_Present(driver)>0)
		{
		driver.navigate().refresh();
		editcust.clickEditCustomer();
		}
		editcust.enterCustomerId(customerID);
		editcust.submitcid();
		
		if(isAlertPresent()==true) { String alertMessage=
				  driver.switchTo().alert().getText(); logger.warn(alertMessage); }
		
		editcust.custaddress("H. no. 123. SAS Nagar");
		editcust.custcity("Mohali");
		editcust.custstate("Punjab");
		editcust.custpinno("123456");
		editcust.custtelephoneno("987456123");
		String email=randomestring()+"@mailinator.com";
		editcust.custemailid(email);
		editcust.custsubmit();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.info("Login passed");
		}
		else
		{
			logger.info("Login failed");
			Assert.assertTrue(false);
			
		}
	}
}
