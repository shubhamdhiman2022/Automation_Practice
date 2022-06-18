package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
	
	String driverpath="C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe";
	
	WebDriver driver;
	
	String url= "https://demo.guru99.com/V4/";
	final String username= "mngr378840";
	final String password= "agahAqy";
	
	@Test(priority= 1)
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority= 2)
	public void login()
	{
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(priority= 3)
	public void verifydashboard()
	{
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}
	
	@Test(priority= 4)
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page" );
	}
	
	@Test(priority= 5)
	public void browserterminate()
	{
		driver.close();
	}
	

}
