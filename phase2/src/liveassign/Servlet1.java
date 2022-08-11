package liveassign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Dashbaord Page");
		System.out.println("Dashbaord Page");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user1 = request.getParameter("user");
        String pass1= request.getParameter("password");
        if( user1.equals("devrajbhanu1998@gmail.com") && pass1.equals("123456")  ){
        	out.println("<br>");
        	response.getWriter().write("Userid And Password is Correct");
        	out.println("<br>");
        	response.getWriter().write("Login Successful");
        	out.println("<br>");
        	out.print("<a href='loggingout'>Logout</a>");
            
        	
            
    }
        else  {  
        	out.println("<br>");
        response.getWriter().write("Invalid userid or Password");
            }	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
