import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class errormsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "http://49.249.236.30:8654/ali-a/contact-us/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title = driver.getTitle();
		System.out.println("Title of the website: " + title);
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/div[7]/input")).click();
		System.out.println("Clicked");
		  WebElement err = driver.findElement(By.className("form-group"));
		  System.out.println(err.getText());
		 

	}

}
