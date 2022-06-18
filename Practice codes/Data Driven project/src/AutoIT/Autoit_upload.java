package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoit_upload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement element = driver.findElement(By.id("uploadfile"));
		Actions action= new Actions(driver);
		action.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\My new folder\\autoittest.exe");

	}

}
