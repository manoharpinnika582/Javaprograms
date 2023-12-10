import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/university";
		String USER_NAME="root";
		String PASSWORD="manu";
		String CREATE_STUDENT_QUERY="CREATE TABLE STUDENT1(ID INT,NAME VARCHAR(30),MARKS INT);";
		try {       
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully!");
			
		Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established successfully");
			
			Statement stmt= con.createStatement();
			
			stmt.execute(CREATE_STUDENT_QUERY);
			System.out.println("Create Table Successfully!....");
		}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}
