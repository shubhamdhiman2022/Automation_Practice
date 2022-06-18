import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  String baseurl="https://sfbay.craigslist.org/";
		  
			/*
			 * String baseurl=
			 * "https://sfbay.craigslist.org/d/for-sale/search/sss?s=120&query=smart%20tv&sort=rel";
			 */
		  driver.get(baseurl);
		  
			/* driver.manage().window().maximize(); */
		  
		  String title= driver.getTitle();
		  System.out.println("Title of the website: "+title);
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("smart tv");
		  driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(Keys.ENTER);
		  
		  
		  
			
			
			/*
			 * WebElement butn=driver.findElement(By.linkText("next >"));
			 * System.out.println(butn.getAttribute("href")); butn.click();
			 */
			  
			  
			  WebElement start = driver.findElement(By.className("rangeFrom"));
			 
			  WebElement end = driver.findElement(By.className("rangeTo"));
			  WebElement total =driver.findElement(By.className("totalcount"));
			  String stdata= start.getText();
			  int stpt = Integer.parseInt(stdata);
			  System.out.println(stpt);
			  String enddata= end.getText();
			  int endpt = Integer.parseInt(enddata);
			  System.out.println(endpt);
			  String totaldata=total.getText();
			  int totalpt=Integer.parseInt(totaldata);
			  System.out.println(totalpt);
			  int count;
			  count=totalpt/endpt;
			  System.out.println(count);
			  for(int ct=1;ct<=totalpt;ct++)
			  {
				  System.out.println("Sr. no.: "+stpt++);
			  }
			  
			  
			  
			  
			  
			  
			  
			/*
			 * System.out.println(start.getText()); System.out.println(end.getText());
			 * System.out.println(total.getText()); System.out.println("pass"); String
			 * a=start.getText(); int stpt=Integer.parseInt(a);
			 */
		  
			/*
			 * for(int i=0; i<10;i++) { System.out.println(i);
			 * 
			 * 
			 * System.out.println(a); System.out.println(stpt++);
			 * 
			 * }
			 * 
			 * 
			 * while(butn.isDisplayed());
			 */
		 

		/*
		 * int a=0; for(int i=0;i<100;i++) { System.out.println(a++); }
		 */
		 

	}

}
