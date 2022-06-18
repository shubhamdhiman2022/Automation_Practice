import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Logger log= Logger.getLogger("devpinoyLogger");
		log.debug("Entering website");
		driver.get("https://healthunify.com/bmicalculator/");
		log.debug("Entering Weight");
		driver.findElement(By.name("wg")).sendKeys("60");
		log.debug("Selecting Kilogram");
		driver.findElement(By.name("opt1")).sendKeys("kilograms");
		log.debug("Selecting height in feet");
		driver.findElement(By.name("opt2")).sendKeys("5");
		log.debug("Selecting height in inches");
		driver.findElement(By.name("opt3")).sendKeys("8");
		log.debug("Click on calculate");
		driver.findElement(By.name("cc")).click();
		
		log.debug("Getting SI unit");
		String siunit = driver.findElement(By.name("si")).getAttribute("value");
		log.debug("Getting US unit");
		String usunit= driver.findElement(By.name("us")).getAttribute("value");
		log.debug("Getting UK unit");
		String ukunit= driver.findElement(By.name("uk")).getAttribute("value");
		log.debug("Description: ");
		String desc= driver.findElement(By.name("desc")).getAttribute("value");
		
		System.out.println("SI Unit: "+siunit);
		System.out.println("US Unit: "+usunit);
		System.out.println("UK Unit: "+ukunit);
		System.out.println("Description: "+desc);
		driver.close();
		
		
		
	}

}
