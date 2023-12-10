import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoDemo {
	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/university";
		String USER_NAME="root";
		String PASSWORD="manu";
		String INSERT_STUDENT_QUERY="INSERT INTO STUDENT1(ID,NAME,MARKS) VALUES(103,'SIRI',99)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			Connection con	=DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			Statement stmt	=con.createStatement();

			int rowAffected=stmt.executeUpdate(INSERT_STUDENT_QUERY);
			System.out.println(rowAffected+" row Affected");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
