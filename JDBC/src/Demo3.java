// insert values into database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String url ="jdbc:mysql://localhost:3306/dbms?user=root&password=System";
		String sql = "insert into Student values(?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id name age marks email phone");
			int id = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			int marks = sc.nextInt();
			String email = sc.next();
			int phone = sc.nextInt();
			 ps.setInt(1, id);
			 ps.setString(2, name);
			 ps.setInt(3, age);
			 ps.setInt(4, marks);
			 ps.setString(5, email);
			 ps.setInt(6, phone);
			 
			 int nora = ps.executeUpdate();
			 System.out.println(nora + "row(s) inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (con != null) con.close();
				if (ps != null) ps.close();
				sc.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
