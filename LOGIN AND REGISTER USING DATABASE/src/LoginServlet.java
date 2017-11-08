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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBConnection db=new DBConnection();
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		Connection con=db.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select count(*) from db1info where name=? and pass=?");
			ps.setString(2,pass);
			ps.setString(1,name);
			int i=0;
			ResultSet rs=ps.executeQuery();
			rs.next();
				i=rs.getInt(1);
				System.out.println(i);
			
			
			
			if(i>0){
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				pw.println("Welcome "+name);
				rd.include(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				pw.println("Error in login");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
