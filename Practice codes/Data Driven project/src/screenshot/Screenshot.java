package screenshot;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

		String url = "http://49.249.236.30:2121/login";
		driver.get(url);
		TakesScreenshot srnshot = ((TakesScreenshot)driver);
		File srcfile= srnshot.getScreenshotAs(OutputType.FILE);
		File dstfile= new File("C:\\Users\\deftsoft\\Pictures\\Camera Roll\\sreenshot1.png");
		FileUtils.copyFile(srcfile,dstfile); 
		System.out.println("Screenshot captured Successfully");
	

	}

}
