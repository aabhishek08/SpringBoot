package jdbc;
import java.sql.*;
public class mysqlconne {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			 if(con.isClosed()) {
				 System.out.println("Connection is closed");
				 
			 }else {
				 System.out.println("Connection is created");
			 }
			
		}
		catch(Exception e)
{
			e.printStackTrace();
}}}