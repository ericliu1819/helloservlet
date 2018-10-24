package mypkg;

import javax.servlet.*;

public class HelloWorldFilter extends MyGenericFilter {
  private FilterConfig filterConfig; 

  public void doFilter(final ServletRequest request,
                       final ServletResponse response,
                       FilterChain chain)
       throws java.io.IOException, javax.servlet.ServletException  { 
    System.out.println("Entering Filter");
    request.setAttribute("hello","Hello World!");
    chain.doFilter(request,response);
    System.out.println("Exiting HelloWorldFilter"); 
  } 
} 