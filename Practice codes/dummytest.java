import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class dummytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="https://sfbay.craigslist.org/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */ 
		
		  driver.findElement(By.xpath("//*[@id=\"query\"]")).
		  sendKeys("smart tv");
		  driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(
		  Keys.ENTER);
		 
		/*
		 * List<WebElement> value= driver.findElements(By.className("result-price"));
		 * System.out.println("Size of data"+value.size()); for(int i=0; i<value.size();
		 * i++) { System.out.println(value.get(i).getText()); }
		 */
		

	}

}
