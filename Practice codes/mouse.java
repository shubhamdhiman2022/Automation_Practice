package Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class mouse {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://49.249.236.30:3132/maayish/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/a/img"));
	String title= driver.getTitle();
	System.out.println("Title of the page: "+title);
		File folder= new File("e:\\Testing folder");
		folder.mkdir();
		FileWriter file= new FileWriter("e:\\Testing folder\\test.txt");
		BufferedWriter br= new BufferedWriter(file);
		br.write("hello we are going to test: "+title);
		br.newLine();
		br.write("Selenium Webdriver: Result: passed");
		br.close();
		System.out.println("Pass");
		driver.close();

	}

}
