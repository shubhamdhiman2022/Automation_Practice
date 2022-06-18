import java.util.List;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sfbaytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://sfbay.craigslist.org/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title = driver.getTitle();
		System.out.println("Title of the website: " + title);
		int count=1;
		/*
		 * WebElement house = driver.findElement(By.className("hhh"));
		 * System.out.println("TagName: "+house.getTagName());
		 * System.out.println("link: "+house.getAttribute("href")); house.click();
		 */
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("smart tv");
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(Keys.ENTER);

		/*
		 * WebElement list= driver.findElement(By.xpath("//*[@id=\"gridview\"]"));
		 * list.click();
		 * 
		 * WebElement view=driver.findElement(By.id("picview")); view.click();
		 */
		List<WebElement> price = driver.findElements(By.className("result-meta"));
		System.out.println("size: " + price.size());
		for (int i = 0; i < price.size(); i++) {
			System.out.print("Sr.no: "+(count++)+"  ||  Price:");
			System.out.println(price.get(i).getText());
			System.out.println("==================");
		}
		String[] str= new String[price.size()];
		String string="";
		StringBuffer num= new StringBuffer(), aplha = new StringBuffer(), special
				 =new StringBuffer();
		for(int i=0; i<price.size(); i++)
		{
			str[i]= price.get(i).getText();
			string=Arrays.toString(str);
			/* System.out.println(str[i]); */
			System.out.println("String value: "+string);
			/*
			 * for(int q=0; q<string.length(); q++) {
			 * if(Character.isAlphabetic(string.charAt(q))) aplha.append(string.charAt(q));
			 * 
			 * else num.append(string.charAt(q)); } System.out.println(num);
			 */
		}
		
		/*
		 * String string= Arrays.toString(str); System.out.println(string);
		 */
		
		
		/*
		 * StringBuffer num= new StringBuffer(), aplha = new StringBuffer(), special
		 * =new StringBuffer(); for(int i=0; i<str.length; i++) {
		 * if(Character.isDigit(str.c) }
		 */
		

	}

}
