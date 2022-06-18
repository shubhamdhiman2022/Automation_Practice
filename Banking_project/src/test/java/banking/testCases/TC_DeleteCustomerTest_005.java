package banking.testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import banking.pageObjects.DeleteCustomerPage;
import banking.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass
{
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		DeleteCustomerPage delCust = new DeleteCustomerPage(driver);
		delCust.clickDeleteCustomer();
		
		logger.info("providing customer ID....");
		if (is_iframe_Present(driver)>0)
		{
		driver.navigate().refresh();
		delCust.clickDeleteCustomer();
		}
		delCust.enterCustomerId(customerID);
		delCust.submitcid();
		Thread.sleep(2000);
		if(isAlertPresent()==true)
		{
			Alert alert = driver.switchTo().alert();
			String alertmessage=alert.getText();
			logger.info(alertmessage);
			alert.accept();
			 Assert.assertTrue(true);
			 
			 alertmessage=alert.getText();
			 logger.info(alertmessage);
			 alert.accept();
			Assert.assertEquals(alertmessage, "Customer has been deleted successfully!!");
			driver.switchTo().defaultContent();
		}
		
	}
}
