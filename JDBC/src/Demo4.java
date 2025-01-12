// Delete the rows from table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String url ="jdbc:mysql://localhost:3306/dbms?user=root&password=System";
		String sql = "delete from Student where id = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id to delete");
			int id = sc.nextInt();
			ps.setInt(1, id);
			int nora = ps.executeUpdate();
			System.out.println(nora + "row(s) deleted");
			
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
