import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
	    try {
	    	// step-1
	    	
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("DRIVER LOADED..");
	        
	        // step-2
	        
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "System");
	        System.out.println("CONNECTION ESTABLISHED");
	        
	        Statement stmt = con.createStatement();
	        System.out.println("Statement created");
	       
	       // step-4
	       String sql = "select * from Student";
	        ResultSet rs = stmt.executeQuery(sql);
	        System.out.println("Query executed..");
	        System.out.println("Enter ID || name || age || marks || email || phone");
	        
	        // step-5
	        while(rs.next()) {
	        	System.out.println(rs.getInt(1) +"||" + rs.getString(2) + "||" + rs.getInt(3) + "||" + rs.getInt(4) + "||" + rs.getString(5) + "||" + rs.getInt(6));
	        }
	        
	        // step-6
	        
	        con.close();
	        stmt.close();
	        rs.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
