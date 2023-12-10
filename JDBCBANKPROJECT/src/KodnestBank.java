
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class KodnestBank implements BankMethods {
	private Connection con=null;
	private Scanner scan=null;
	public static KodnestBank ref=null;

	//Creating single ton Object
	public static KodnestBank getInstance() {
		if(ref==null) {
			ref=new KodnestBank();
		}
		return ref;
	}


	public KodnestBank() {
		try {
			scan=new Scanner(System.in);
			String path="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@//localhost:1521/XE";
			String user="system";
			String password="manu";
			Class.forName(path);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public void register() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			System.out.println("Enter confirm password");
			String cpwd=scan.next();
			System.out.println("Enter Name");
			String name=scan.next();
			System.out.println("Enter Amount");
			int amt=scan.nextInt();
			System.out.println("Enter Age");
			int age=scan.nextInt();
			System.out.println("Enter Email");
			String email=scan.next();
			System.out.println("Enter Phone number");
			long phone=scan.nextLong();
			if(accno.length()!=10 || pwd.equals(cpwd)==false ||name.length()<=3 || amt<=0||age<=18||email.length()<10||String.valueOf(phone).length()!=10){
				System.out.println("Some Error occurs in Registration..plz try again....");
			}
			else {
				String sql="insert into kodnestbank values(?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, accno);
				ps.setString(2, pwd);
				ps.setString(3, name);
				ps.setInt(4, amt);
				ps.setInt(5, age);
				ps.setString(6, email);
				ps.setLong(7, phone);
				int nora=ps.executeUpdate();
				if(nora==1) {
					System.out.println("Registartion Successfull....");
				}
				else {
					System.out.println("Some Error occurs Plz contact Nearest Branch....");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void login() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			String sql="select * from kodnestbank where accno=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, accno);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Login Successful.....");
				System.out.println("Your Amount Is = "+rs.getInt("amount"));
			}
			else {
				System.out.println("Invalid Accoun or Password...please try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void changePassword() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			String sql="select * from kodnestbank where accno=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, accno);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				System.out.println("Enter new Password");
				String npwd=scan.next();
				System.out.println("Enter new Confirm Password");
				String cnpwd=scan.next();
				if(npwd.equals(cnpwd)) 
				{
					String sql1="update kodnestbank set password=? where accno=? and password=?";
					PreparedStatement ps1=con.prepareStatement(sql1);
					ps1.setString(1, cnpwd);
					ps1.setString(2, accno);
					ps1.setString(3, pwd);
					int nora=ps1.executeUpdate();
					if(nora==1) 
					{
						System.out.println("Your Password Updated Successfully....");
					}
				}
				else 
				{
					System.out.println("Password and Confirm password not matched..");
				}

			}
			else {
				System.out.println("Invalid Accoun or Password...please try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void balanceEnquiry() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			String sql="select * from kodnestbank where accno=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, accno);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Your Amount Is = "+rs.getInt("amount"));
			}
			else {
				System.out.println("Invalid Accoun or Password...please try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void transferAmount() {
		try {
			String sql1 = "update kodnestbank set amount=amount-? where accno=? and password=?";
			String sql2="update kodnestbank set amount=amount+? where accno=?";
			con.setAutoCommit(false);
		PreparedStatement ps1=con.prepareStatement(sql1);
		PreparedStatement ps2=con.prepareStatement(sql2);
		System.out.println("Enter from Account Number");
		String faccno=scan.next();
		System.out.println("Enter from Password");
		String fpwd=scan.next();
		System.out.println("Enter To Account Number");
		String taccno=scan.next();
		System.out.println("Enter Amount To Transfer");
		int amt=scan.nextInt();
		
		
		ps1.setInt(1, amt);
		ps1.setString(2, faccno);
		ps1.setString(3, fpwd);
		int nora1=ps1.executeUpdate();
		
		ps2.setInt(1, amt);
		ps2.setString(2, taccno);
		int nora2=ps2.executeUpdate();
		System.out.println(nora1+" "+nora2);
		if(nora1==1 && nora2==1) {
			con.commit();
			System.out.println("Money Transfer Successfully...");
		}
		else {
			System.out.println("Some Error Occurs in Transaction");
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	@Override
	public void updateProfile() {
		
	}

	@Override
	public void deleteAccount() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			String sql="select * from kodnestbank where accno=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, accno);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				System.out.println("Are you Sure want to delete (y/n)");
				char confirm = scan.next().charAt(0);
				if(String.valueOf(confirm).equalsIgnoreCase("y")) 
				{
					String sql1="delete from kodnestbank where accno=?";
					PreparedStatement ps1=con.prepareStatement(sql1);
					ps1.setString(1, accno);
					int nora1=ps1.executeUpdate();
					if(nora1==1) 
					{
						System.out.println("You Account Delete Successfully....");
					}
				}
				else {
					System.out.println("You Changed Your Decision...Thank you....");
				}
				
				
			}
			else {
				System.out.println("Invalid Accoun or Password...please try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void checkProfile() {
		try {
			System.out.println("Enter Account Number");
			String accno=scan.next();
			System.out.println("Enter Password");
			String pwd=scan.next();
			String sql="select * from kodnestbank where accno=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, accno);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("++++++++++++++++++++++++++");
				System.out.println("Account Number = "+rs.getString("accno"));
				System.out.println("Password = "+rs.getString("password"));
				System.out.println("Name = "+rs.getString("name"));
				System.out.println("Amount = "+rs.getInt("amount"));
				System.out.println("Age = "+rs.getInt("age"));
				System.out.println("Email = "+rs.getString("email"));
				System.out.println("Phone Number = "+rs.getLong("phone"));
				System.out.println("++++++++++++++++++++++++++");
			}
			else {
				System.out.println("Invalid Accoun or Password...please try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




}
