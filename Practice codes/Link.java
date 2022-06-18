import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/newtours/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */ 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Data Size: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}

	}

}
