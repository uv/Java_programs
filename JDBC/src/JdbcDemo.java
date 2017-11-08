
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo {
	static Scanner sc = new Scanner(System.in);
	ResultSet rs = null;
	Connection con=null;
	PreparedStatement ps =null;
public static void main(String[] args) throws SQLException {
	String choose=null;
	JdbcDemo i1=new JdbcDemo();
	do{
	System.out.println("1.Insert Data or 2.Display Data or 3.Update Data or 4. Delete Data or 5.Search Data");
	int ch = sc.nextInt();
	if (ch==1){
		i1.insertData();
	}else if (ch==2) {
		i1.displayData();
	}else if (ch==3){
		i1.updateData();
	}else if (ch==4){
		i1.deleteData();
	}else if (ch==5){
		i1.searchData();
	}
	System.out.println("Do you want to perform more operations:-yes/no");
	choose = sc.next();
	}while(choose.equals("yes"));
}
	void req(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/uv","root","root");//localhost
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	void insertData() throws SQLException{
		req();
		ps = con.prepareStatement("insert into studentinfo values(?,?)");
		System.out.println("Enter ID of student:-");
		ps.setInt(1,sc.nextInt());
		System.out.println("Enter name oof student:-");
		ps.setString(2, sc.next());
		 System.out.println("Do you want to add more records:-yes/no");
		 String ch=sc.next();
		 ps.executeUpdate();
		 if(ch.equals("yes"))
		{
			insertData();
		}else{
			System.out.println("Data inserted...");
		}
		}
	void displayData() throws SQLException{	
			req();
			ps = con.prepareStatement("select * from studentinfo");
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("ID:- "+rs.getString(1)+" Name:-"+rs.getString(2));
			}
}
	void updateData() throws SQLException{
			req();
			System.out.println("Enter the ID where to update name:-");
			int id=sc.nextInt();
			System.out.println("Enter the name to update:-");
			String name =sc.next();
			
			ps = con.prepareStatement("update studentinfo set name='"+name+"' where id="+id);
			ps.executeUpdate();
			System.out.println("Data is updated...");
	}
	void deleteData() throws SQLException{	
			req();
			System.out.println("Enter ID to delete:-");
			int id=sc.nextInt();
			ps = con.prepareStatement("delete from studentinfo where id="+id);
			ps.executeUpdate();
			System.out.println("Data is Daleted...");
	}
	void searchData() throws SQLException{	
			req();
			System.out.println("Enter id to search record:-");
			int id=sc.nextInt();		
			ps = con.prepareStatement("select * from studentinfo where id="+id);
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("ID:- "+rs.getString(1)+" Name:-"+rs.getString(2));
			}else{
				System.out.println("Record not found...");
			}
		}
}