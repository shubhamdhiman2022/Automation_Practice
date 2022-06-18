import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="https://commons.apache.org/proper/commons-io/download_io.cgi";
		driver.get(baseurl);
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot)driver; File scrfile =
		 * screenshot.getScreenshotAs(OutputType.FILE); File desfile= new
		 * File("E:\\My folder\\test.png"); FileUtils.copyFile(scrfile, desfile);
		 */
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\My folder\\test.png"));
		Thread.sleep(5000);
		driver.close();
		
	}

}
