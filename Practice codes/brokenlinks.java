import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class brokenlinks {
private static WebDriver driver= null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		String homepage="http://49.249.236.30:8654/richard/project/";
		String url= "";
		String linktext="";
		int respcode;
		HttpURLConnection huc=null;
		driver= new ChromeDriver();
		/* driver.manage().window().maximize(); */
		driver.get(homepage);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int i=1;
	
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
		   System.out.println(i++);
		   url=it.next().getAttribute("href");
		   System.out.println("Link: "+url);
			/*
			 * linktext=it.next().getText(); System.out.println("Link Text: "+linktext );
			 */
		   if(url==null || url.isEmpty())
		   {
				
				  System.out.
				  println("URL is either not configured for anchor tag or it is empty");
				  System.out.println("=========================");
				 
			   continue;
		   }
			
			  if(!url.startsWith("http://49.249.236.30:8654/richard/project/")) {
					
					  System.out.println("URL belongs to another domain, skipping it.");
					  System.out.println("=========================");
					 
			  continue;
			  }
			 
		   try
		   {
			   huc= (HttpURLConnection)(new URL(url).openConnection());
			   huc.setRequestMethod("HEAD");
			   huc.connect();
			   respcode=huc.getResponseCode();
			   

               if(respcode >= 400){
                   System.out.println("\""+url+"\""+" is a broken link");
               }
               else
               { 
				   System.out.println("\""+url+"\""+" is a valid link"); 
               }
			   
		   }
		   catch(MalformedURLException e)
		   {
			  System.out.println(e);
		   }
		   catch(IOException e)
		   {
			   System.out.println(e);
		   }
		   System.out.println("=========================");
		}
		
	}

}
