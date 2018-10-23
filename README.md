# helloservlet
We need the Servlet API library to compile this program. Servlet API is not part of JDK or Java SE (but belongs to Java EE). Tomcat provides a copy of servlet API called "servlet-api.jar" in "<CATALINA_HOME>\lib". You could copy "servlet-api.jar" from "<CATALINA_HOME>\lib" to "<JAVA_HOME>\jre\lib\ext" (the JDK Extension Directory), or include the Servlet JAR file in your CLASSPATH.
To compile the program under JDK, we need to use the -d option to specify the output destination directory to place the compiled class in "helloservlet\WEB-INF\class\mypkg" directory.

// Change directory to <CATALINA_HOME>\webapps\helloservlet\WEB-INF
d:\...> cd <CATALINA_HOME>\webapps\helloservlet\WEB-INF
  
// Compile the source file and place the class in the specified destination directory
d:\<CATALINA_HOME>\webapps\helloservlet\WEB-INF> javac -d classes src\mypkg\HelloServlet.java
