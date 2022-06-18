
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class chrome {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl= "https://google.com";
		driver.get(baseurl);
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).
		 * sendKeys("Facebook"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).
		 * sendKeys(Keys.ENTER);
		 */		driver.close();

			} 

		}

