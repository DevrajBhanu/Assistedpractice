package advanced.java.program;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 

public class validfilter implements Filter{
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
        String userId = request.getParameter("user");
        String pass= request.getParameter("password");
        if( userId != null && pass!=null ){
        	response.getWriter().write("passing through LoginFilter...............");
            chain.doFilter(request, response);
    }else           
        response.getWriter().write("blocked by LoginFilter as there is no userid or password");
}

public void init(FilterConfig fConfig) throws ServletException {
   
}

public void destroy() {
    
}
}
