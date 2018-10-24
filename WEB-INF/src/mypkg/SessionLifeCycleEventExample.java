package mypkg;
import javax.servlet.http.*;
import javax.servlet.*;

public class SessionLifeCycleEventExample 
   implements ServletContextListener, HttpSessionListener
{
   /* A listener class must have a zero-argument constructor: */
   public SessionLifeCycleEventExample()
   {
   }

   /* Methods for the HttpSessionListener */
   public void sessionCreated(HttpSessionEvent hse)
   {
      System.out.println("Entering sessionCreated");  
      log("CREATE",hse);
   }
   public void sessionDestroyed(HttpSessionEvent hse)
   {
         System.out.println("Entering sessionDestroyed");
         HttpSession _session = hse.getSession();
         long _start = _session.getCreationTime();
         long _end = _session.getLastAccessedTime();
         String _counter = (String)_session.getAttribute("counter");
         log("DESTROY, Session Duration:" 
                   + (_end - _start) + "(ms) Counter:" + _counter, hse);
   }
   
   protected void log(String msg, HttpSessionEvent hse)
   {
      String _ID = hse.getSession().getId();
      log("SessionID:" + _ID + "    " + msg);
   }
   
   protected void log(String msg)
   {
      System.out.println("[" + getClass().getName() + "] " + msg);
   }
}