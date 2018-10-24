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
        if (requestURI.contains("/redirect")) {
            System.out.println("Successful");
        //    String toReplace = requestURI.substring(requestURI.indexOf("/redirect"), requestURI.lastIndexOf("/") + 1);
            String toReplace = "sayhello";
            System.out.println(toReplace);
            String newURI = requestURI.replace("/helloservlet/redirect",toReplace);
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