package mypkg;
import javax.servlet.*;

public class MyGenericFilter implements javax.servlet.Filter {
  public FilterConfig filterConfig;                                 //1

  public void doFilter(final ServletRequest request,                //2
                       final ServletResponse response,
                       FilterChain chain)
      throws java.io.IOException, javax.servlet.ServletException { 
    chain.doFilter(request,response);                               //3
  } 

  public void init(final FilterConfig filterConfig) throws javax.servlet.ServletException {               //4
    this.filterConfig = filterConfig;
  } 

  public void destroy() {                                           //5
  }
}