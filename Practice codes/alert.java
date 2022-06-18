import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		String url="http://demo.guru99.com/test/delete_customer.php";
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12443");
		driver.findElement(By.name("submit")).click();;
		String alertmessage= driver.switchTo().alert().getText();
		System.out.println("Alert message: "+alertmessage);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		/*
		 * String alertmessage2= driver.switchTo().alert().getText();
		 * System.out.println("Alert message 2: "+alertmessage2); alert.accept();
		 */
		

	}

}
