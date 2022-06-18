import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Brokenlinkslisttextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String homepage= "https://www.defactoinfotech.com/";
		String url= "";
		String linktext="";
		int respcode;
		HttpURLConnection huc=null;
		driver.get(homepage);
		/* driver.manage().window().maximize(); */
		
		File folder = new File("e://Defacto broken links");
		folder.mkdir();
		FileWriter file= new FileWriter("e://Defacto broken links//brokenlink.txt");
		BufferedWriter br = new BufferedWriter(file);
		String title = driver.getTitle();
		br.write("Title of site: "+title);
		br.newLine();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		/* System.out.println(links.size()); */
		br.write("No. of links: "+links.size());
		br.newLine();
		int i=1;
	
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
			/* System.out.println(i++); */
			/* br.write(i++); */
		   url=it.next().getAttribute("href");
			/* System.out.println("Link: "+url); */
			/*
			 * linktext=it.next().getText(); System.out.println("Link Text: "+linktext );
			 */
		   if(url==null || url.isEmpty())
		   {
				
				/*
				 * System.out.
				 * println("URL is either not configured for anchor tag or it is empty");
				 * System.out.println("=========================");
				 */
				 
			   continue;
		   }
			
			  if(!url.startsWith("https://www.defactoinfotech.com/")) {
					
					/*
					 * System.out.println("URL belongs to another domain, skipping it.");
					 * System.out.println("=========================");
					 */
					 
			  continue;
			  }
			 
		   try
		   {
			   huc= (HttpURLConnection)(new URL(url).openConnection());
			   huc.setRequestMethod("HEAD");
			   huc.connect();
			   respcode=huc.getResponseCode();
			   

               if(respcode >= 400){
            	   br.write("\""+url+"\""+" is a broken link");
            	   br.newLine();
					/* System.out.println("\""+url+"\""+" is a broken link"); */
               }
               else
               { 
					/* System.out.println("\""+url+"\""+" is a valid link"); */
               }
			   
		   }
		   catch(MalformedURLException e)
		   {
				/* System.out.println(e); */
		   }
		   catch(IOException e)
		   {
				/* System.out.println(e); */
		   }
			/* System.out.println("========================="); */
		}
		br.close();
driver.close();
	}

}
