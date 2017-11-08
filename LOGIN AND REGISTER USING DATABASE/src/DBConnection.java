import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
Connection con;
public Connection getConnection(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		System.out.println("connection establish...");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public static void main(String[] args) {
	DBConnection db=new DBConnection();
	db.getConnection();
}
}
