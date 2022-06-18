import java.io.BufferedWriter;
import java.util.concurrent.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class product {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				String baseurl = "https://sfbay.craigslist.org/";
				driver.get(baseurl);
				/* driver.manage().window().maximize(); */
				String title = driver.getTitle();
				System.out.println("Title of the website: " + title);
				
				
				
				  File folder = new File("e:\\My folder"); folder.mkdir(); FileWriter file =
				  new FileWriter("E:\\My folder\\newtest.txt"); BufferedWriter br = new
				  BufferedWriter(file); br.write("Title of the website: " + title);
				  br.newLine(); System.out.println("file created");
				 

				driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("smart tv");
				driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(Keys.ENTER);
				List<WebElement> value = driver.findElements(By.className("result-info"));
				List<WebElement> id = driver.findElements(By.className("result-title"));

				WebElement start = driver.findElement(By.className("rangeFrom"));
				WebElement end = driver.findElement(By.className("rangeTo"));
				WebElement total = driver.findElement(By.className("totalcount"));

				String a = start.getText();
				String b = end.getText();
				String c = total.getText();
				int stpt = Integer.parseInt(a);
				int edpt = Integer.parseInt(b);
				int ttl = Integer.parseInt(c);
				int count;
				count = ttl / edpt;
				
				  System.out.println("Start from: "+stpt);
				  System.out.println("End to: "+edpt); 
				  System.out.println("Total products on page: "+ttl);
				  System.out.println("loop count: "+count);
				 
				  
				  System.out.println("Total no. of Related items that you have searched availabe on Website is: " +ttl); 
				  System.out.println("===================Page No. :1===================");
				  System.out.println("No. of data id's: "+id.size());
				  System.out.println("Size of data fetch: "+value.size());
				  System.out.println("Start from: "+stpt);
				  System.out.println("End to: "+edpt); 
				  System.out.println("Total products on page: "+ttl);
				  System.out.println();
				  
				  for(int i=0;i<value.size();i++) 
				  {
					  System.out.println("item no."+stpt++);
					  System.out.println("Product id: "+id.get(i).getAttribute("data-id"));
					  System.out.println("Product info: "+value.get(i).getText());
					  System.out.println("=======================");
				  }
					  for(int i=0;i<value.size();i++) {
						  br.write("item.no."+stpt++); 
						  br.newLine();
						  br.write("Id's: "+id.get(i).getAttribute("data-id"));
						  br.newLine();
						  br.write("Product info: "+value.get(i).getText()); 
						  br.newLine();
						  br.write("==============================");
						  br.newLine();
				  }
				  
				  
					
					  for(int pageno =1; pageno<=count; pageno++ ) {
					  
					  System.out.println("===================Page No. :"+(pageno+1)+
					  "===================");
					  
					  System.out.println();
					  
					  WebElement nextbutn = driver.findElement(By.linkText("next >"));
					  nextbutn.click();
					  
					  value =driver.findElements(By.className("result-info")); id=
					  driver.findElements(By.className("result-title")); start =
					  driver.findElement(By.className("rangeFrom")); end =
					  driver.findElement(By.className("rangeTo")); total =
					  driver.findElement(By.className("totalcount"));
					  
					  
					  a = start.getText(); b = end.getText(); c = total.getText(); stpt =
					  Integer.parseInt(a); edpt = Integer.parseInt(b); ttl = Integer.parseInt(c);
					  
					  System.out.println(); System.out.println("No. of data id's: "+id.size());
					  System.out.println("Size of data fetch: "+value.size());
					  System.out.println("Start from: "+stpt); System.out.println("End to: "+edpt);
					  System.out.println("Total products on page: "+ttl);
					  
					  for(int i=0;i<value.size();i++) { System.out.println("item no."+stpt++);
					  System.out.println("Product id: "+id.get(i).getAttribute("data-id"));
					  System.out.println("Product info: "+value.get(i).getText());
					  System.out.println("=======================");
					  
					  }
					  
					  }
					  System.out.println("Total "+ttl+" items data has been fetched successfully");
					 
			}



	}

