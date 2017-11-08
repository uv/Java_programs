import java.sql.*;  
import java.io.*;  
public class InsertImage {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/test","root","root");  
              
PreparedStatement ps=con.prepareStatement("insert into person1 values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("D:\\images\\uv.jpeg");  
//ps.setBinaryStream(2,fin,fin.available());  
ps.setBlob(2,fin);
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
} 