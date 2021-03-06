package servlets;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;


public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        PrintWriter out = servletResponse.getWriter();

        String password = servletRequest.getParameter("password");
        if (password.equals("admin")) {
            filterChain.doFilter(servletRequest, servletResponse);//sends request to next resource
        } else if(!password.equals("admin")){
            RequestDispatcher rd = servletRequest.getRequestDispatcher("login");
            rd.forward(servletRequest,servletResponse);
            rd.include(servletRequest, servletResponse);
        }
    }
    @Override
    public void destroy() {

    }
}
