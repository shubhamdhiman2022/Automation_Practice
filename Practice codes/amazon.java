
    import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.BufferedWriter;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class amazon {
		public static void main(String[]args) throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			String baseurl="https://www.amazon.in/";
			driver.get(baseurl);
			driver.manage().window().maximize();
			String title= driver.getTitle();
			System.out.println("Title of the website: "+title);
			FileWriter file = new FileWriter("E:\\My folder\\test.txt");
			BufferedWriter br = new BufferedWriter(file); 
			br.write("Hello we are in txt file and data of the website: "+title);
			br.newLine();
			br.close();
			System.out.println("Test pass");
			
		}

	}
