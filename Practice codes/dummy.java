import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver(); 
		String baseurl="https://sfbay.craigslist.org/d/for-sale/search/sss?query=iphone&sort=rel";
		driver.get(baseurl);
		List<WebElement> value =driver.findElements(By.className("result-info"));
	    List <WebElement> id= driver.findElements(By.className("result-title"));
	    System.out.println("No. of data id's: "+id.size());
		System.out.println("Size of data fetch: "+value.size());
		System.out.println();
		for(int i=0;i<value.size();i++)
		
		{
			System.out.println("item.no."+(i+1));
			System.out.println("Product id: "+id.get(i).getAttribute("data-id"));
			System.out.println("Product info: "+value.get(i).getText()); 
			System.out.println("=======================");
			
		}
	}}