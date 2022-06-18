package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Writexcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String [] str= {"Qa","Dept."};
		File file=new File("E:\\My folder\\qa.xlsx");
		FileInputStream input= new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(input);
		Sheet sheet= workbook.createSheet("Test cases");
		//int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row=sheet.createRow(0);
		//Row newrow= sheet.createRow(rowcount+1);
		for (int j=0; j<2; j++)
		{
			Cell cell= row.createCell(j);
			cell.setCellValue(str[j]);
			
		}
		FileOutputStream output= new FileOutputStream(file);
		workbook.write(output);
		workbook.close();

	}

}
