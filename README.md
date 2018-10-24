# helloservlet
We need the Servlet API library to compile this program. Servlet API is not part of JDK or Java SE (but belongs to Java EE). Tomcat provides a copy of servlet API called "servlet-api.jar" in "<CATALINA_HOME>\lib". You could copy "servlet-api.jar" from "<CATALINA_HOME>\lib" to "<JAVA_HOME>\jre\lib\ext" (the JDK Extension Directory), or include the Servlet JAR file in your CLASSPATH.
To compile the program under JDK, we need to use the -d option to specify the output destination directory to place the compiled class in "helloservlet\WEB-INF\class\mypkg" directory.

// Change directory to <CATALINA_HOME>\webapps\helloservlet\WEB-INF
d:\...> cd <CATALINA_HOME>\webapps\helloservlet\WEB-INF
  
// Compile the source file and place the class in the specified destination directory
# d:\<CATALINA_HOME>\webapps\helloservlet\WEB-INF> javac -d classes src\mypkg\HelloServlet.java

# Filter
Overview of Servlet Filters
When the servlet container calls a method in a servlet on behalf of the client, the HTTP request that the client sent is, by default, passed directly to the servlet. The response that the servlet generates is, by default, passed directly back to the client, with its content unmodified by the container. In this scenario, the servlet must process the request and generate as much of the response as the application requires.

But there are many cases in which some preprocessing of the request for servlets would be useful. In addition, it is sometimes useful to modify the response from a class of servlets. One example is encryption. A servlet, or a group of servlets in an application, may generate response data that is sensitive and should not go out over the network in clear-text form, especially when the connection has been made using a nonsecure protocol such as HTTP. A filter can encrypt the responses. Of course, in this case the client must be able to decrypt the responses.

A common scenario for a filter is one in which you want to apply preprocessing or postprocessing to requests or responses for a group of servlets, not just a single servlet. If you need to modify the request or response for just one servlet, there is no need to create a filter—just do what is required directly in the servlet itself.

Note that filters are not servlets. They do not implement and override HttpServlet methods such as doGet() or doPost(). Rather, a filter implements the methods of the javax.servlet.Filter interface. The methods are:

init()

destroy()

doFilter()

Use a Filter when you want to filter and/or modify requests based on specific conditions. Use a Servlet when you want to control, preprocess and/or postprocess requests.
