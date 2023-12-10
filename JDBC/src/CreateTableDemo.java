import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreateTableDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","manu");
			System.out.println("Connection Established.....");

			Statement stmt=con.createStatement();
			System.out.println("Statement Created");

			stmt.executeQuery("create table kodnestuser(id int,name varchar2(30),gender varchar2(6),age int)");
			System.out.println("Table Created Successfully");
			
			con.close();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
