import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBCMySQLConnection {
	static Connection con;
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/even","root","root");
			System.out.println("connection establish...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}  
}