package JCBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class mysqldb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dburl=  "jdbc:mysql://localhost/test";
		String username= "root";
		String password= "";
		String query= "Select * from student;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(dburl, username, password);
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		for(int i=0;i<3;i++)
		{
			
		if(rs.next());
		{
			String id= rs.getString("id");
			String name= rs.getNString("name");
			String email= rs.getNString("email");
			String address= rs.getNString("address");
			String city= rs.getNString("city");
			String marks= rs.getString("marks");
			System.out.println(id+"|"+name+"|"+email+"|"+address+"|"+city+"|"+marks);
		}
		}
		

	}

}
