import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	
	public Connection getConnection() {
		
		try {
			//check for validation
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineVotingDB", "root", "MyNewPass");
			return con;
			
		} catch (ClassNotFoundException e) {
			//if class forName not found
			System.out.println("Class not found");
			e.printStackTrace();
			return null;
			
		} catch (SQLException e) {
			//if mysql content not found
			System.out.println("SQLException");
			e.printStackTrace();
			return null;	
		}	
	}
}
