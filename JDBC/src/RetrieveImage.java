import java.sql.*;  
import java.io.*;  
public class RetrieveImage {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/test","root","root");  
      
PreparedStatement ps=con.prepareStatement("select * from person1");  
ResultSet rs=ps.executeQuery();  
if(rs.next()){//now on 1st row  
              
Blob b=rs.getBlob(2);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
              
FileOutputStream fout=new FileOutputStream("D:\\images\\uv1.jpeg");  
fout.write(barr);  
              
fout.close();  
}//end of if  
System.out.println("ok");  
              
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
} 