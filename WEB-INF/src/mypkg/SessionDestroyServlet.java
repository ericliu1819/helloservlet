package mypkg;
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDestroyServlet extends HttpServlet { 

    public void doGet (HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException
      {
        System.out.println("Entering SessionDestroyServlet");  
         //Get the session object
         HttpSession session = req.getSession(true);
         // Invalidate Session
         session.invalidate(); 

         // set content type and other response header fields first
         res.setContentType("text/html");

         // then write the data of the response
         PrintWriter out = res.getWriter();

         out.println("<HEAD><TITLE> " + "Session Destroyed Successfully" +
           "Look at OC4J Console to see whether the HttpSessionEvent invoked " 
           + "</TITLE></HEAD><BODY>");
         out.println("<P>[<A HREF=\"../index.jsp\">Restart</A>]");
         out.println("<h2> Session Destroyed Successfully</h2>");
         out.println("Look at the OC4J Console to see whether the HttpSessionEvent was invoked");
         out.close();
   }
}