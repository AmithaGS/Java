             // Update the record

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String url ="jdbc:mysql://localhost:3306/dbms?user=root&password=System";
		String sql = "update Student set name = ? where id = ?";   // name is 1 and id = 2 put in ps.set()
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter new name and id");
			String newName = sc.next();
			int id = sc.nextInt();
			ps.setInt(2, id);
			ps.setString(1, newName);
			int nora = ps.executeUpdate();
			System.out.println(nora + "row(s) updated");
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
