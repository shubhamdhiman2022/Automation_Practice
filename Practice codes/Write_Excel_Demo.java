import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel_Demo {

	public void write(String filepath, String filename) throws IOException {
		File file = new File(filepath + "\\" + filename);
		FileInputStream input = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(input);
		Sheet sheet = workbook.createSheet("TestName2");
		String str[][] = new String[2][2];
		str[0][0] = "Shubham";
		str[0][1] = "Dhiman";
		str[1][0] = "QA";
		str[1][1] = "Engineer";
		for (int i = 0; i < str.length; i++) 
		{
				Row row= sheet.createRow(i);
				for(int j= 0; j <str.length; j++ ) 
				{
					Cell cell = row.createCell(j);
					cell.setCellValue(str[i][j]);
				}
				
		}
		
		/*
		 * Row row = sheet.createRow(0); Cell cell= row.createCell(0);
		 * cell.setCellValue("TEst names2") ;
		 */
		// workbook.removeSheetAt(0);
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
		workbook.close();

	}

	public static void main(String[] args) throws IOException {
		Write_Excel_Demo obj = new Write_Excel_Demo();
		obj.write("C:\\My Excel file folder", "Write_File.xlsx");

	}

}
