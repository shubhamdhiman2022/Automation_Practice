import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_page {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Page Title: "+driver.getTitle());
		WebElement heading_title= driver.findElement(By.xpath("//h1[@class='post-title entry-title']/a"));
		System.out.println("Heading Title Text: "+heading_title.getText());
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name='chkbox']")).click();
		driver.findElement(By.xpath("//input[@name='male']")).click();
		driver.findElement(By.xpath("//input[@name='age']")).sendKeys("24");
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12/12/1998");
		WebElement proof = driver.findElement(By.xpath("//select"));
		Select proof_drop= new Select(proof);
		proof_drop.selectByValue("pp");
		WebElement country = driver.findElement(By.name("country"));
		country.sendKeys("India");
		/*
		 * WebElement coun_drop=
		 * driver.findElement(By.xpath("//*[@id=\"Country\"]/option[1]")); Actions
		 * action = new Actions(driver);
		 * action.moveToElement(coun_drop).click().build().perform();
		 */
		
		//Select cntry_drop= new Select(country);
		//cntry_drop.selectByVisibleText("India");
		WebElement file=driver.findElement(By.id("uploadfile"));
		Actions action = new Actions(driver);
				  //action.moveToElement(file).click().build().perform();
				  Thread.sleep(3000);
		//Runtime.getRuntime().exec("E:\\My new folder\\autoittest.exe");
		List <WebElement> table= driver.findElements(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/table/tbody/tr"));
		System.out.println("Size: "+table.size());
		for(int i=0; i<table.size();i++)
		{
			System.out.println(table.get(i).getText());
		}
		driver.findElement(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/table/tbody/tr[4]/td[1]/input")).click();
		WebElement dragitem = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		WebElement dropitem= driver.findElement(By.id("div1"));
		action.clickAndHold(dragitem).moveToElement(dropitem).release(dropitem).build().perform();
		//System.out.println(dropitem.getLocation());
		//action.dragAndDropBy(dragitem, 34, 2127);
		WebElement tooltop= driver.findElement(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/abbr/b"));
		System.out.println(tooltop.getAttribute("title"));
		driver.findElement(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/input[11]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.className("pbtsharethisbutt"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		driver.findElement(By.className("pbtfacebook")).click();
		
		  driver.findElement(By.className("pbttwitter")).click();
		  driver.findElement(By.className("pbtgoogle")).click();
		  driver.findElement(By.className("pbtstumbleupon")).click();
		  driver.findElement(By.className("pbtdigg")).click();
		 
		String Mainwindow = driver.getWindowHandle();
		Set <String> allwindow = driver.getWindowHandles();
		System.out.println("Window size: "+allwindow.size());
		Iterator<String> it = allwindow.iterator();
		while(it.hasNext())
		{
			String childwindow = it.next();
			if(!Mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(Mainwindow);
		
		
		 
		
		
		
		//driver.close();
	}

}
