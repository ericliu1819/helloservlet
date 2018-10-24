package mypkg;
import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.*;

public class UrlRewriteFilter extends MyGenericFilter {

    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        System.out.println("Entering UrlRewriteFilter");
        HttpServletRequest request = (HttpServletRequest) req;
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        if (requestURI.startsWith("/helloservlet/redirect")) {
            System.out.println("Successful");
            String toReplace = requestURI.substring(requestURI.indexOf("/redirect"), requestURI.lastIndexOf("/") + 1);
            System.out.println(toReplace);
            String newURI = requestURI.replace(toReplace, "?Contact_Id=");
            System.out.println(newURI);
            req.getRequestDispatcher(newURI).forward(req, res);
        } else {
            System.out.println("Fail");
            chain.doFilter(req, res);
        }
    }

    public void destroy() {
        //
    }
}