package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  File file= new File("E:\\My folder\\test.xlsx");
		  FileInputStream input= new FileInputStream(file);
		  Workbook workbook= new XSSFWorkbook(input); 
		  Sheet sheet=workbook.getSheet("Sheet1"); 
		  int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		  System.out.println("Total no. of rows: "+(rowcount+1)); 
		  for(int
		  i=0;i<rowcount+1;i++) 
		  { 
			  Row row= sheet.getRow(i); 
			  for(int j=0;j<row.getLastCellNum();j++) 
			  {
				  System.out.print(row.getCell(j).getStringCellValue()+"// ");
			  }
		  System.out.println(); } workbook.close();
		 
	
	}

}
