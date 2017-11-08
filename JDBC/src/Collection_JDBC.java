import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Collection_JDBC {
	public static void main(String[] args) {
		//Set<Student> stud= new TreeSet<Student>();
		ArrayList<Student> al=new ArrayList<Student>();
		Connection con=null;
		ResultSet srs=null;
		PreparedStatement ps =null;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/uv","root","root");
				 ps= con.prepareStatement("select * from studentinfo");
			     srs=ps.executeQuery();
			     while (srs.next()) {
			    	 //System.out.println(srs.getInt(1));
		                Student student = new Student();
		                student.setId(srs.getInt(1));
		                student.setName(srs.getString(2));
		                al.add(student);
		            }
			     System.out.println(al);
			     			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
	}
}