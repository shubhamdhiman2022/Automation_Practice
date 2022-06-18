package banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage 
{
	WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText= "Delete Customer")
	WebElement deletecust;
	
	@FindBy(name = "cusid")
	WebElement txtcustomerid;
	
	@FindBy(name = "AccSubmit")
	WebElement submitidbtn;
	
	public void clickDeleteCustomer()
	{
		deletecust.click();
	}
	
	public void enterCustomerId(String customerID)
	{
		txtcustomerid.sendKeys(customerID);
	}
	
	public void submitcid()
	{
		submitidbtn.click();
	}
	
}
