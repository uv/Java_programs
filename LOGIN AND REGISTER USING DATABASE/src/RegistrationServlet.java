import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registration")
public class RegistrationServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBConnection db= new DBConnection();
		PrintWriter pw=response.getWriter();
		Connection con=db.getConnection();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select count(*) from db1info");
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next()){
				
				if(rs.getInt(1)==id){
					count++;
					/**/
				}
			}if(count>0){
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				
				pw.println("duplicate id....");
				rd.forward(request, response);}
				else{
			
					try {
						PreparedStatement ps1=con.prepareStatement("insert into db1info values(?,?,?)");
						ps1.setInt(1, id);
						ps1.setString(2, name);
						ps1.setString(3, password);
						int i=ps1.executeUpdate();
						System.out.println(i);
						if(i>0){
							RequestDispatcher rd1=request.getRequestDispatcher("login.html");
							rd1.include(request, response);
						}else {
							RequestDispatcher rd2=request.getRequestDispatcher("registration.html");
							pw.println("Error in registration.....");
							rd2.include(request, response);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
