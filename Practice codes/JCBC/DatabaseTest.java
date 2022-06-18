package JCBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DatabaseTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from student");
			File file= new File("C:\\My Excel file folder\\database.xls");
			file.createNewFile();
			FileInputStream input= new FileInputStream(file);
			Workbook myworkbook= new HSSFWorkbook(input);
			Sheet mysheet= myworkbook.createSheet("Database");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			String id= rs.getNString("Id");
			int rowcount= 0;
			int columncount=0;
			Row row= mysheet.createRow(rowcount++);
			Cell cell=row.createCell(columncount++);
			cell.setCellValue(id);
			FileOutputStream output= new FileOutputStream(file);
			myworkbook.write(output);
			myworkbook.close();
			
			

	}

}
