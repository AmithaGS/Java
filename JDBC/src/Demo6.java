import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		
	Connection con = null;
	PreparedStatement ps1 = null;
	PreparedStatement ps2 = null;
	Scanner sc = new Scanner(System.in);
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url ="jdbc:mysql://localhost:3306/dbms?user=root&password=System";
	String sql1 = "update ucucucu set balance=balance-? where accno=?";
	String sql2 = "update ucucucu set balance=balance+? where accno=?";
	
	try {
		Class.forName(dpath);            // loading the driver (to establish the connection)
		con = DriverManager.getConnection(url);   // establish the connection
		ps1 = con.prepareStatement(sql1);  // creating the medium
		ps2 = con.prepareStatement(sql2);
		System.out.println("Enter from Accno, To Accno and Amount to Transfer");
		int fan = sc.nextInt();
		int tan = sc.nextInt();
		int amount = sc.nextInt();
		ps1.setInt(1, amount);
		ps2.setInt(1, amount);
		ps1.setInt(2, fan);
		ps2.setInt(2, tan);
		con.setAutoCommit(false);
		
		int res1 = ps1.executeUpdate();
		System.out.println("Deducted from " + res1 + "row(s)");
		int res2 = ps2.executeUpdate();
		System.out.println("Credited to " + res2 + "row(s)");
		con.commit();
	}
	catch (Exception e) {
		try {
			if (con != null) {
			con.rollback();    // if an issue come it rollback
			System.out.println("Transaction rollback");
			}
		}
		catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	finally {      // closing the resources
		try {
			if (con != null) con.close();
			if (ps1 != null)ps1.close();
			if (ps2 != null)ps2.close();
			sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}