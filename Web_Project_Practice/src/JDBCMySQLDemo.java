 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;;


 
public class JDBCMySQLDemo {
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Column Name:");
         
        String name;
        try {
        	name =br.readLine();
            JDBCMySQLDemo demo = new JDBCMySQLDemo();
            Employee employee = demo.getEmployee(name);
            System.out.println(employee);           
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
 
    public Employee getEmployee(String name)  {      
        ResultSet rs = null;
        Connection connection = null;
        PreparedStatement statement = null; 
         
        Employee employee = null;
        try {           
            connection = JDBCMySQLConnection.getConnection();
            statement =connection.prepareStatement("select * from eve");
            rs = statement.executeQuery();
             
            if (rs.next()) {
                employee = new Employee();
                employee.setName(rs.getString(1));
                String str=rs.getString(1);
                int k=str.length()/2;
                if(str.length()/2!=0) {
                	System.out.println(str);
                System.out.println(str.substring(0, k));
                }
                
            
           }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return employee;
    }
}