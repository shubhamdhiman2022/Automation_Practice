package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Justfortest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  DesiredCapabilities cap= DesiredCapabilities.chrome();
		  cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		String url = "https://wetransfer.com/";
		driver.get(url);
		
		  WebElement element=driver.findElement(By.xpath(
		  "/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[3]/div[4]/button[1]"))
		  ; element.click();
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button")
			).click(); /*
						 * driver.findElement(By.xpath(
						 * "/html/body/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/h2")).click();
						 * Runtime.getRuntime().exec("E:\\My folder\\FileUpload.exe");
						 */
		 
		driver.findElement(By.className("transfer__toggle-options")).click();
		driver.findElement(By.id("transfer__type-link")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button[2]")).click();
		System.out.println("Done Successfully");

	}

}
