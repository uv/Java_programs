import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class WelcomeUser extends HttpServlet { 
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, 
 HttpServletResponse response) 
 throws ServletException, IOException 
 { 
 
    response.setContentType("text/html"); 
    PrintWriter pwriter = response.getWriter(); 
 
    String name=request.getParameter("uname"); 
    pwriter.print("Hello "+name+"!");
    pwriter.print(" Welcome to TechnoGrowth.com"); 
 } 
 
} 