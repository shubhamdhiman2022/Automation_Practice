package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelsheet {
	
	public void readexcel(String filepath,String filename, String sheetname) throws IOException
	{
		File file= new File(filepath+"//"+filename);
		FileInputStream input=new FileInputStream(file);
		Workbook qafile= null;
		String extnsname= filename.substring(filename.indexOf("."));
		System.out.println(extnsname);
		if (extnsname.equals(".xlsx")) 
		{
			qafile= new XSSFWorkbook(input);
		}
		else if (extnsname.equals(".xls"))
		{
			qafile= new HSSFWorkbook(input);
		}
		Sheet qasheet=qafile.getSheet(sheetname);
		int rowcount= qasheet.getLastRowNum()-qasheet.getLastRowNum();
		
		for(int i=0; i<rowcount+1;i++)
		{
			Row row= qasheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) 
			{
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Readexcelsheet obj=new Readexcelsheet();
		obj.readexcel("E:\\My folder", "test.xlsx", "Sheet1");

	}

}
