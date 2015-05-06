<%-- 
    Document   : profile
    Created on : 05 6, 15, 4:45:46 PM
    Author     : asi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <%
          String username=session.getAttribute("username").toString();
      %>
   <h1>Welcome to your idiotic profile <%=username%></h1>
   <h2><a href="home.jsp">HOME</a></h2>
    </body>
</html>
