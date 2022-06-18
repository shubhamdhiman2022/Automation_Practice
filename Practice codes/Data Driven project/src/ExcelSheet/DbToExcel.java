package ExcelSheet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DbToExcel 
{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		String databaseURL = "jdbc:mysql://localhost/test";
		String user = "root";
		String pass = "";
		String query = "Select * from student";
		String sheetpath = "E:\\My folder\\Data.xlsx";
		
		/*
		 * File file = new File(sheetpath); file.createNewFile();
		 * System.out.println("File Created");
		 */
		 // FileInputStream input= new FileInputStream(file);
		 
				
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(databaseURL,user,pass);
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		String id= rs.getNString(1);
		  String name= rs.getNString(2);
		  String email= rs.getNString(3);
		  String address= rs.getNString(4);
		  String city= rs.getNString(5);
		  int marks= rs.getInt(6);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Database");
		Row headerRow = sheet.createRow(0);
		 
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("Course Name");
 
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("Student Name");
 
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("Timestamp");
 
        headerCell = headerRow.createCell(3);
        headerCell.setCellValue("Rating");
 
        headerCell = headerRow.createCell(4);
        headerCell.setCellValue("Comment");
        int rowcount= 1;
		  while(rs.next())
		  {
		  Row rownext= sheet.createRow(rowcount++);
		  
		  int clmcount= 0;
		  Cell cell= rownext.createCell(clmcount++);
		  cell.setCellValue(id);
		  
		  cell= rownext.createCell(clmcount++);
		  cell.setCellValue(name);
		  
		  cell= rownext.createCell(clmcount++);
		  cell.setCellValue(email);
		  
		  cell= rownext.createCell(clmcount++);
		  cell.setCellValue(address);
		  
		  cell= rownext.createCell(clmcount++);
		  cell.setCellValue(city);
		  
		  cell= rownext.createCell(clmcount++);
		  cell.setCellValue(marks);
		  }
		 
		FileOutputStream output = new FileOutputStream(sheetpath);
		workbook.write(output);
		workbook.close();
	}

}
