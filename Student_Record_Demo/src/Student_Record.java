import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
 
public class Student_Record
{
	static Connection con = null;
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
  public static void main(String[] args)
  {
    String connectionUrl = "jdbc:mysql://localhost:3306/Student_Record";
    String dbUser = "root";
    String dbPwd = "root";
    ResultSet result=null;
    PreparedStatement statement;
    Scanner sc=null;
    try
    {
      
      int ch;
      sc=new Scanner(System.in);
	do {
		con = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
      System.out.println("Select Student Record Operations \n 1.Insert \n2.Display \n3.Update \n4.Delete");
       ch=sc.nextInt();
      switch(ch) {
     
      case 1:
      { 
String sql = "INSERT INTO record (std_rollno, std_name, std_add, std_contact, std_email) VALUES (?, ?, ?, ?, ?)";
          
          statement = con.prepareStatement(sql);
      int count = 1;
	for(int i=0;i<count;i++) {
    	    System.out.println("Enter a Student Rollno");
    	    long rol=sc.nextLong();
    	    statement.setLong(1,rol);
    	    
    	    
    	    System.out.println("Enter a Student Name");
    	    String name1=sc.next();
    	    statement.setString(2,name1);
    	    
    	    System.out.println("Enter a Student Adress only City Name");
    	    String address=sc.next();
    	    statement.setString(3,address);
    	    
    	    System.out.println("Enter a Student Contact");
    	    long contact=sc.nextLong();
    	    statement.setLong(4, contact);
    	    
    	    System.out.println("Enter a Student Email_Id");
    	    String email=sc.next();
    	    statement.setString(5, email);
      }
         
    	  
         int rowsInserted = statement.executeUpdate();
         if (rowsInserted > 0) {
             System.out.println("A new user was inserted successfully!");
             statement.close();
             
         }
         if (con != null)
         {
           con.close();
          
           con = null;
       }
         break;
      }
      case 2:
      {
    	  
      String sql1 = "select * from record";
      
       statement = con.prepareStatement(sql1);
       result = statement.executeQuery(sql1);
      
      while (result.next()){
    	  long Rollno = result.getLong("std_rollno");
          String std_name = result.getString("std_name");
          String address = result.getString("std_add");
          long contactno = result.getLong("std_contact");
          String email = result.getString("std_email");
          System.out.format("%s, %s, %s, %s, %s\n",Rollno, std_name, address, contactno, email);
      }
      statement.close();
      result.close();
      if (con != null)
      {
        con.close();
        statement.close();
        result.close();
        con = null;
    }
      break;
      }
      case 3:
      {
          String query = "update record set std_rollno = ? where std_name = ?";
          statement =con.prepareStatement(query);
          
          System.out.println("enter a new rollno");
          long rol=sc.nextLong();
          statement.setLong(1,rol);
         
          
          System.out.println("enter a name of that old rollno");
          String name=sc.next();
          statement.setString(2, name);
          
          int rowsInserted = statement.executeUpdate();
          if (rowsInserted > 0) {
              System.out.println("A new record update successfully!");
              statement.close();
              
          }
    	  if (con != null)
          {
            con.close();
            con = null;
        }
    	  break;
      }
      case 4:
      {
    	  String query = "delete from record where std_rollno = ?";
        statement = con.prepareStatement(query);
        System.out.println("enter which rollno that which u want to delete");
        long rol=sc.nextLong();
          statement.setLong(1, rol);

          statement.execute();
          System.out.println("Row Deleted Successfully");
                statement.close();
                con.close();
                con=null;
                break;      
      }
      default:{
   	   System.out.println("wrong choice");
      }
      }
      
    	  
      System.out.println("\n Do you want perform operation again yes=1 and no=0");
      ch=sc.nextInt();
      }while(ch==1); 
      sc.close();
    }
    catch (SQLException sqle) 
    {
      System.out.println("SQL Exception thrown: " + sqle);
    }
  }
}
