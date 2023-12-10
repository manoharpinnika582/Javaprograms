import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayTableDemo {
	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/university";
		String USER_NAME="root";
		String PASSWORD="manu";
		String DISPLAY_STUDENT_QUERY="SELECT * FROM STUDENT1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			Connection con	=DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			Statement stmt	=con.createStatement();

		ResultSet res=stmt.executeQuery(DISPLAY_STUDENT_QUERY);
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
		con.close();
		stmt.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
