import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

public class linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/newtours/";
		driver.get(baseurl);
		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		/* driver.manage().window().maximize(); */ 
		List<WebElement> list= driver.findElements(By.tagName("a"));
		String[] linktext= new String[list.size()];
		int i= 0;
		for(WebElement e : list)
		{
			linktext[i]= e.getText();
			i++;
		}
		for(String t: linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underConsTitle))
			{
				System.out.println(t+" is under construction");
			}
			else
			{
				System.out.println(t+" is working");
			}
			driver.navigate().back();
		}
		
		
		

	}

}
