import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datafetch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="https://sfbay.craigslist.org/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title= driver.getTitle();
		System.out.println("Title of the website: "+title);
		File folder= new File("e:\\My folder");
		folder.mkdir();
		FileWriter file = new FileWriter("E:\\My folder\\test.txt");
		BufferedWriter br = new BufferedWriter(file); 
		br.write("Title of the website: "+title);
		br.newLine();
		System.out.println("file created");
	    driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("smart tv");
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(Keys.ENTER);
		List<WebElement> value =driver.findElements(By.className("result-info"));
	    List <WebElement> id= driver.findElements(By.className("result-title"));
	    System.out.println("No. of data id's: "+id.size());
		System.out.println("Size of data fetch: "+value.size());
		System.out.println();
		for(int i=0;i<value.size();i++)
		{
			System.out.println("item no."+(i+1));
			System.out.println("Product id: "+id.get(i).getAttribute("data-id"));
			System.out.println("Product info: "+value.get(i).getText()); 
			System.out.println("=======================");
			
			br.write("item.no."+(i+1));
			br.newLine();
			br.write("Id's: "+id.get(i).getAttribute("data-id"));
			br.newLine();
			br.write("Product info: "+value.get(i).getText());
			br.newLine();
			br.write("==============================");
			br.newLine();
	
		}
		System.out.println("Execution complete");
	

	}

}
