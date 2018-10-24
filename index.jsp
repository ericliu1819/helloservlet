<%@page session="false" %>
<H2>OC4J - HttpSession Event Listeners </H2>
<P>
    This example demonstrates the use of the HttpSession Event and Listener that is
    new with the Java Servlet 2.3 API.
</P>
<P>
    [<a href="servlet/SessionCreateServlet">Create New Session</A>] &nbsp;
    [<a href="servlet/SessionDestroyServlet">Destroy Current Session</A>]
</P>
<P>
    Click the Create link above to start a new HttpSession. An HttpSession
    listener has been configured for this application. The servler container
    will send an event to this listener when a new session is created or
    destroyed. The output from the event listener will be visible in the
    console window from where OC4J was started.
</P>