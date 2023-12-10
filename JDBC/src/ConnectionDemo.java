import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
		Connection con	=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "manu");
		System.out.println("Connection Established");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
