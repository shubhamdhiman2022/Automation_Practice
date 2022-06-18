package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datawritetoexcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://sfbay.craigslist.org/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title = driver.getTitle();
		
		/*
		 * File folder= new File("My new folder"); folder.mkdir();
		 */
		File file= new File("E:\\My new folder\\test.xlsx");
		FileInputStream input= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(input);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println("Title of the website: " + title);
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("smart tv");
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys(Keys.ENTER);
		List<WebElement> value = driver.findElements(By.className("result-info"));
		List<WebElement> id = driver.findElements(By.className("result-title"));
		String[] strvalue= new String[value.size()];
		String [] strid = new String[id.size()];
		for(int i=0; i<value.size(); i++)
		{
			strvalue[i]=value.get(i).getText(); 
			strid[i]=id.get(i).getText();
			Row row= sheet.createRow(i);
			Cell cell1= row.createCell(0);
			Cell cell= row.createCell(1);
			cell.setCellValue(strvalue[i]);
			cell1.setCellValue(strid[i]);
			
		}
		FileOutputStream output= new FileOutputStream(file);
		workbook.write(output);
		workbook.close();
	}

}
