import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class DemoServlet extends HttpServlet{  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  String name1=req.getParameter("first_name");
  pw.println(name1);
  String name2=req.getParameter("last_name");
  pw.println(name2);
  String name3=req.getParameter("Login");
  pw.println(name3);
//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet");  
pw.println("</body></html>");  
  
pw.close();//closing the stream  
}}  