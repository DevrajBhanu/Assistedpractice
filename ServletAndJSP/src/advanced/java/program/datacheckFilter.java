package advanced.java.program;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
public class datacheckFilter implements Filter{
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
        String user1 = request.getParameter("user");
        String pass1= request.getParameter("password");
        if( user1.equals("admin") && pass1.equals("30")  ){
        	response.getWriter().write("passing through LoginFilter...............");
            chain.doFilter(request, response);
    }else           
        response.getWriter().write("blocked by datacheckFilter as there is no userid or password");
}

public void init(FilterConfig fConfig) throws ServletException {
   
}

public void destroy() {
    
}

}
