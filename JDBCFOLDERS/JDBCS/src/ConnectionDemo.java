
public class ConnectionDemo {
	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully!");
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
