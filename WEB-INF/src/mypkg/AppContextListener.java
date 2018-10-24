package mypkg;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class AppContextListener implements ServletContextListener {
    ServletContext servletContext;

    /* Methods from the ServletContextListener */
    public void contextInitialized(ServletContextEvent sce)
    {  
        System.out.println("Entering contextInitialized");  
        ServletContext ctx = sce.getServletContext();
        System.out.println(ctx);
    }

    public void contextDestroyed(ServletContextEvent sce)
    {
        System.out.println("Entering contextDestroyed");
    }
	
}

