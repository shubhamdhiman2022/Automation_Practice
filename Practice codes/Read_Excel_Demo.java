import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Demo {
	
	public void read(String filepath, String filename, String sheetname) throws IOException
	{
		File file = new File(filepath+"\\"+filename);
		FileInputStream input= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(input);
		Sheet sheet= workbook.getSheet(sheetname);
		int rowCount=(sheet.getLastRowNum()-sheet.getFirstRowNum())+1;
		System.out.println("No. of rows: "+rowCount);
		for(int i=0;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		workbook.close();
	}

	public static void main(String[] args) throws IOException {
		
		Read_Excel_Demo obj= new Read_Excel_Demo();
		obj.read("C:\\My Excel file folder", "Read_File.xlsx", "Sheet1");
	}

}
