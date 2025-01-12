import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String sql = "select * from Student where id = ?";
		String dPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dbms";
		String user = "root";
		String password = "System";
		Scanner sc = new Scanner(System.in);
		
		try {     // try is guarded region
			Class.forName(dPath);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			System.out.println("Enter ID");
			int id = sc.nextInt();
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			  // multiple rows are present go through while loop
			if (rs.next()) {    // check row is there are not
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			}
			
		}
		catch (Exception e) {    // catch is handling region
			e.printStackTrace();
		}
		finally {
			try {
				con.close();    // resource cleanUp
				ps.close();
				rs.close();
				sc.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
