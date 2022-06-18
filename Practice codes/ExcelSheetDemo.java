import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.log4j.Logger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetDemo {
	
	public void Excel(String filepath, String filename, String sheetname) throws IOException
	{
		File file = new File(filepath+"\\"+filename);
		FileInputStream input= new FileInputStream(file);
		Logger log = Logger.getLogger("devpinoyLogger");
		Workbook workbook = new XSSFWorkbook(input);
		log.debug("We are entering into workbook");
		Sheet sheet= workbook.getSheet(sheetname);
		int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0; i<=rowcount;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		ExcelSheetDemo demo= new ExcelSheetDemo();
		demo.Excel("C:\\My Excel file folder", "Data.xlsx", "Sheet1");
		
	}

}
