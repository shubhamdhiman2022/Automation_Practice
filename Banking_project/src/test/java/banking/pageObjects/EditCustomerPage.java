package banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage 
{
	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Edit Customer")
	WebElement editCustomer;
	
	@FindBy(name = "cusid")
	WebElement txtcustomerid;
	
	@FindBy(name = "AccSubmit")
	WebElement submitidbtn;
	
	@FindBy(name = "addr")
	WebElement txtaddress;

	@FindBy(name = "city")
	WebElement txtcity;

	@FindBy(name = "state")
	WebElement txtstate;

	@FindBy(name = "pinno")
	WebElement txtpinno;

	@FindBy(name = "telephoneno")
	WebElement txttelephoneno;

	@FindBy(name = "emailid")
	WebElement txtemailid;

	@FindBy(name = "sub")
	WebElement btnSubmit;
	
	public void clickEditCustomer()
	{
		editCustomer.click();
	}
	
	public void enterCustomerId(String customerID)
	{
		txtcustomerid.sendKeys(customerID);
	}
	
	public void submitcid()
	{
		submitidbtn.click();
	}
	
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) 
	{
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno)
	{
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno)
	{
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
}
