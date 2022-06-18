package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://softwaretestingplace.blogspot.com//2015//10//sample-web-page-to-test.html";
		driver.get("https://demo.guru99.com/test/autoit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement element= driver.findElement(By.id("uploadfile"));
		//js.executeScript("arguments[0].scrollIntoView();",element );
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.switchTo().frame(0);
		//driver.findElement(By.id("postjob")).click();
		//driver.findElement(By.name("firstname")).sendKeys("Test");
		Thread.sleep(5000);
		WebElement path = driver.findElement(By.id("input_5"));
		Actions action = new Actions(driver);
		action.moveToElement(path).click().build().perform();
		//driver.findElement(By.xpath("//input[@id=\"uploadfile\"]")).sendKeys("E:\\My folder\\test.png");
		//driver.findElement(By.id("input_3")).sendKeys("QA Engineer");
		
		 // driver.findElement(By.id("input_4")).sendKeys("qa@yopmail.com");
		 // driver.findElement(By.id("id_5")).click();
		  //Runtime.getRuntime().exec("E:\\My folder\\FileUpload.exe");
		  //driver.findElement(By.id("input_6")).sendKeys("This is for testing purpose");
		  //driver.findElement(By.id("input_2")).click();
		 

	}

}
