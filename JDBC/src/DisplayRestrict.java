import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplayRestrict {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String Restrict_Display_Query="select * from kodnestuser where id=? and age=?";
		try {
			//1.load the driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			//2.Establish the connection
			con	=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "manu");
			System.out.println("Connection Established");

			//3.Create the statement
			ps =con.prepareStatement(Restrict_Display_Query);
			System.out.println("Statement Created");
			
			//take id from user
			System.out.println("Enter user id");
			int id=scanner.nextInt();
			System.out.println("Enter user age");
			int age=scanner.nextInt();
			ps.setInt(1,id);
			ps.setInt(2, age);
			
			//4.ExecuteQuery
			 rs=ps.executeQuery();
			
			//5.Display the result
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("gender")+" "+rs.getInt("age"));
			}
			
			//6.close the resource
			con.close();
			ps.close();
			rs.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
