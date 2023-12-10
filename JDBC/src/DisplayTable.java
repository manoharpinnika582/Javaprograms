import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayTable {
	public static void main(String[] args) {
		try {
			//1.load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			//2.Establish the connection
			Connection con	=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "manu");
			System.out.println("Connection Established");

			//3.Create the statement
			Statement stmt=con.createStatement();
			System.out.println("Statement Created");

			//4.ExecuteQuery
			ResultSet rs=stmt.executeQuery("select * from kodnestuser");
			System.out.println("Query Executed successfully");
			
			//5.Display the result
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("gender")+" "+rs.getInt("age"));
			}
			
			//6.close the resource
			con.close();
			stmt.close();
			rs.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
