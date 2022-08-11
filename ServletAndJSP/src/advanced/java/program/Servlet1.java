package advanced.java.program;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
		{
	    	PrintWriter pw=res.getWriter();
			//res.setContentType("text/html");

			ServletConfig conf=getServletConfig();// Step 1: instantiate ServeltConfig
			ServletContext con=getServletContext();

			String s1=con.getInitParameter("a");   //Step 2: fetching the parameters from the web.xml
			String s2=con.getInitParameter("b");
			String s3=con.getInitParameter("c");
			String s4=conf.getInitParameter("n1");
			

			pw.println("a value is " +s1+ " and b is " +s2+"and c is "+s3+"and d is "+s4);
			//pw.println("total is " + (s1+ s2));
			
			//pw.println("Servlet Name" + conf.getServletName());
			//pw.println("Servlet context" + conf.getServletContext());

		   pw.close();	
		}

}
